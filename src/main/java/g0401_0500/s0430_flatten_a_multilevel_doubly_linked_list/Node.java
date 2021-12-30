package g0401_0500.s0430_flatten_a_multilevel_doubly_linked_list;

@SuppressWarnings("java:S1104")
public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node prev, Node next, Node child) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }

    @Override
    public String toString() {
        return "Node{" + "val=" + val + ",next=" + next + "}";
    }
}
