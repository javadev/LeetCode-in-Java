package g0601_0700.s0641_design_circular_deque;

// #Medium #Array #Design #Linked_List #Queue #2022_03_21_Time_3_ms_(100.00%)_Space_42.9_MB_(84.01%)

public class MyCircularDeque {
    private final int[] data;
    private int front;
    private int rear;
    private int size;

    public MyCircularDeque(int k) {
        data = new int[k];
        front = 0;
        rear = k - 1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (size == data.length) {
            return false;
        }
        data[front] = value;
        front = (front + 1) % data.length;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size == data.length) {
            return false;
        }
        data[rear] = value;
        rear = (rear - 1 + data.length) % data.length;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }
        front = (front - 1 + data.length) % data.length;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }
        rear = (rear + 1) % data.length;
        size--;
        return true;
    }

    public int getFront() {
        if (size == 0) {
            return -1;
        }

        return data[(front - 1 + data.length) % data.length];
    }

    public int getRear() {
        if (size == 0) {
            return -1;
        }
        return data[(rear + 1) % data.length];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
}

/*
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
