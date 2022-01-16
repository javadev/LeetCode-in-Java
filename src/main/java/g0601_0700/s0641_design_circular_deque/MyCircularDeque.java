package g0601_0700.s0641_design_circular_deque;

// #Medium #Array #Design #Linked_List #Queue

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
        int val = data[front];
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }
        rear = (rear + 1) % data.length;
        int val = data[rear];
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
