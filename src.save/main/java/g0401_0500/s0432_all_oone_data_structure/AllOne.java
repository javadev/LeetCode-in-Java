package g0401_0500.s0432_all_oone_data_structure;

// #Hard #Hash_Table #Design #Linked_List #Doubly_Linked_List
// #2022_03_18_Time_97_ms_(54.00%)_Space_107_MB_(15.94%)

import java.util.HashMap;
import java.util.Map;

public class AllOne {
    private static class Node {
        String key;
        int val;
        Node prev;
        Node next;

        Node(String key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private static class DoubleLinkedList {
        Node head;
        Node tail;

        DoubleLinkedList() {}

        // Swap adjacent nodes till the node fits to its position
        Node fixOrder(Node node) {
            while (node.next != null && node.val > node.next.val) {
                swapAdjacentNodes(node, node.next);
            }
            while (node.prev != null && node.val < node.prev.val) {
                swapAdjacentNodes(node.prev, node);
            }
            return node;
        }

        // Swap two adjacent nodes, where node1 -> node2
        void swapAdjacentNodes(Node node1, Node node2) {
            node1.next = node2.next;
            node2.prev = node1.prev;
            if (node1.next != null) {
                node1.next.prev = node1;
            }
            if (node2.prev != null) {
                node2.prev.next = node2;
            }
            node1.prev = node2;
            node2.next = node1;
            // node0 -> node2 -> node1 -> node3
            if (node1 == head) {
                head = node2;
            }
            if (node2 == tail) {
                tail = node1;
            }
        }
        // New node has counter 1 and should be at the head of the list
        Node add(Node node) {
            node.next = head;
            if (head != null) {
                head.prev = node;
            }
            head = node;
            // is it is the first node
            if (tail == null) {
                tail = head;
            }
            return node;
        }

        void remove(Node node) {
            if (node.prev != null) {
                node.prev.next = node.next;
            } else {
                head = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            } else {
                tail = node.prev;
            }
        }
    }

    private DoubleLinkedList dll = new DoubleLinkedList();
    private Map<String, Node> counter = new HashMap<>();

    /* Initialize your data structure here. */
    public AllOne() {
        // empty
    }

    /* Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        Node node = counter.get(key);
        if (node == null) {
            node = new Node(key, 1);
            counter.put(key, node);
            // add first
            dll.add(node);
        } else {
            node.val++;
            // after increment/decrement node may have incorrect position.
            dll.fixOrder(node);
        }
    }

    /* Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        Node node = counter.get(key);
        if (node == null) {
            return;
        }
        node.val--;
        if (node.val == 0) {
            counter.remove(key);
            // completely remove node from list
            dll.remove(node);
        } else {
            // after increment/decrement node may have incorrect position.
            dll.fixOrder(node);
        }
    }

    /* Returns one of the keys with maximal value. */
    public String getMaxKey() {
        if (dll.tail == null) {
            return "";
        }
        return dll.tail.key;
    }

    /* Returns one of the keys with Minimal value. */
    public String getMinKey() {
        if (dll.head == null) {
            return "";
        }
        return dll.head.key;
    }
}

/*
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
