package g0401_0500.s0460_lfu_cache;

// #Hard #Hash_Table #Design #Linked_List #Doubly_Linked_List
// #2022_03_18_Time_45_ms_(99.66%)_Space_117.9_MB_(98.21%)

import java.util.HashMap;
import java.util.Map;

public class LFUCache {
    private static class Node {
        Node prev;
        Node next;
        int key = -1;
        int val;
        int freq;
    }

    private final Map<Integer, Node> endOfBlock;
    private final Map<Integer, Node> map;
    private final int capacity;
    private final Node linkedList;

    public LFUCache(int capacity) {
        endOfBlock = new HashMap<>();
        map = new HashMap<>();
        this.capacity = capacity;
        linkedList = new Node();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node newEndNode = map.get(key);
            Node endNode;
            Node currEndNode = endOfBlock.get(newEndNode.freq);
            if (currEndNode == newEndNode) {
                findNewEndOfBlock(newEndNode);
                if (currEndNode.next == null || currEndNode.next.freq > newEndNode.freq + 1) {
                    newEndNode.freq++;
                    endOfBlock.put(newEndNode.freq, newEndNode);
                    return newEndNode.val;
                }
            }
            if (newEndNode.next != null) {
                newEndNode.next.prev = newEndNode.prev;
            }
            newEndNode.prev.next = newEndNode.next;
            newEndNode.freq++;
            if (currEndNode.next == null || currEndNode.next.freq > newEndNode.freq) {
                endNode = currEndNode;
            } else {
                endNode = endOfBlock.get(newEndNode.freq);
            }
            endOfBlock.put(newEndNode.freq, newEndNode);
            if (endNode.next != null) {
                endNode.next.prev = newEndNode;
            }
            newEndNode.next = endNode.next;
            endNode.next = newEndNode;
            newEndNode.prev = endNode;
            return newEndNode.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node endNode;
        Node newEndNode;
        if (capacity == 0) {
            return;
        }
        if (map.containsKey(key)) {
            map.get(key).val = value;
            get(key);
        } else {
            if (map.size() == capacity) {
                Node toDelete = linkedList.next;
                map.remove(toDelete.key);
                if (toDelete.next != null) {
                    toDelete.next.prev = linkedList;
                }
                linkedList.next = toDelete.next;
                if (endOfBlock.get(toDelete.freq) == toDelete) {
                    endOfBlock.remove(toDelete.freq);
                }
            }
            newEndNode = new Node();
            newEndNode.key = key;
            newEndNode.val = value;
            newEndNode.freq = 1;
            map.put(key, newEndNode);
            endNode = endOfBlock.getOrDefault(1, linkedList);
            endOfBlock.put(1, newEndNode);
            if (endNode.next != null) {
                endNode.next.prev = newEndNode;
            }
            newEndNode.next = endNode.next;
            endNode.next = newEndNode;
            newEndNode.prev = endNode;
        }
    }

    private void findNewEndOfBlock(Node node) {
        Node prev = node.prev;
        if (prev.freq == node.freq) {
            endOfBlock.put(node.freq, prev);
        } else {
            endOfBlock.remove(node.freq);
        }
    }
}
