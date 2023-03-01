package g0801_0900.s0895_maximum_frequency_stack;

// #Hard #Hash_Table #Stack #Design #Ordered_Set
// #2022_03_28_Time_43_ms_(65.81%)_Space_70.1_MB_(27.87%)

import java.util.HashMap;

public class FreqStack {
    private static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        Node() {
            this.next = null;
        }
    }

    private static class DLL {
        DLL next;
        int val;
        Node head;
        int size;

        public DLL() {
            head = new Node();
            this.size = 0;
        }

        public void addNode(int x) {
            Node node = new Node(x);
            node.next = head.next;
            head.next = node;
            size++;
        }

        public Node removeNode() {
            Node node = head.next;
            if (node != null) {
                head.next = node.next;
                node.next = null;
                size--;
            }
            return node;
        }
    }

    private int max;
    private HashMap<Integer, Integer> freqMap;
    private HashMap<Integer, DLL> freqListMap;

    public FreqStack() {
        max = 0;
        freqMap = new HashMap<>();
        freqListMap = new HashMap<>();
    }

    public void push(int val) {
        int count = freqMap.getOrDefault(val, 0) + 1;
        max = Math.max(max, count);
        freqMap.put(val, count);
        DLL dll = freqListMap.getOrDefault(count, new DLL());
        dll.addNode(val);
        freqListMap.put(count, dll);
    }

    public int pop() {
        DLL dll = freqListMap.get(max);
        Node node = dll.removeNode();
        freqMap.put(node.val, max - 1);
        if (dll.size == 0) {
            max--;
        }
        return node.val;
    }
}

/*
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
