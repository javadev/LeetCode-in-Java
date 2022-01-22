package g0701_0800.s0707_design_linked_list;

// #Medium #Design #Linked_List

public class MyLinkedList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        if (index == 0) {
            return head.val;
        }
        int i = 0;
        Node ptr = head;
        while (i++ < index - 1) {
            ptr = ptr.next;
        }
        return ptr.next.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        int i = 0;
        Node node = new Node(val);
        Node ptr = head;
        while (i++ < index - 1) {
            ptr = ptr.next;
        }
        node.next = ptr.next;
        ptr.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        int i = 0;
        Node ptr = head;
        while (i++ < index - 1) {
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        if (index == size - 1) {
            tail = ptr;
        }
        size--;
    }
}
