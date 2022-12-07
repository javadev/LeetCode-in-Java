package g0601_0700.s0622_design_circular_queue;

// #Medium #Array #Design #Linked_List #Queue #Programming_Skills_II_Day_20
// #2022_03_21_Time_3_ms_(100.00%)_Space_42.8_MB_(83.38%)

public class MyCircularQueue {
    private final DoubleLinkedNode dumyHead = new DoubleLinkedNode(0);
    private final int maxSize;
    private int size = 0;

    public MyCircularQueue(int k) {
        this.maxSize = k;
        dumyHead.left = dumyHead;
        dumyHead.right = dumyHead;
    }

    public boolean enQueue(int value) {
        if (size == maxSize) {
            return false;
        }
        DoubleLinkedNode node = new DoubleLinkedNode(value);
        DoubleLinkedNode right = dumyHead.right;
        dumyHead.right = node;
        node.left = dumyHead;
        node.right = right;
        right.left = node;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (size == 0) {
            return false;
        }
        DoubleLinkedNode left = dumyHead.left;
        dumyHead.left = left.left;
        dumyHead.left.right = dumyHead;
        size--;
        return true;
    }

    public int rear() {
        if (size == 0) {
            return -1;
        }
        return dumyHead.right.val;
    }

    public int front() {
        if (size == 0) {
            return -1;
        }
        return dumyHead.left.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    static class DoubleLinkedNode {
        private final int val;
        private DoubleLinkedNode left;
        private DoubleLinkedNode right;

        public DoubleLinkedNode(int val) {
            this.val = val;
        }
    }
}

/*
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.front();
 * int param_4 = obj.rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
