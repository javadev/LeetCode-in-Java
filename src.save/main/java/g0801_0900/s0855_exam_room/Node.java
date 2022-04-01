package g0801_0900.s0855_exam_room;

import java.util.Map;

class Node {
    Node pre;
    Node next;
    int val;

    Node(int val, Map<Integer, Node> map) {
        this.val = val;
        map.put(val, this);
    }

    int insert(Node left) {
        Node right = left.next;
        left.next = this;
        right.pre = this;
        this.next = right;
        this.pre = left;
        return val;
    }

    void delete() {
        Node left = this.pre;
        Node right = this.next;
        left.next = right;
        right.pre = left;
    }
}
