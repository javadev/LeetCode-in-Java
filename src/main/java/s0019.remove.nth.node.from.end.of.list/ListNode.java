package s0019.remove.nth.node.from.end.of.list;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        String result = "";
        ListNode nextCopy = next;
        while (nextCopy.next != null) {
            result += ", " + nextCopy.val;
            nextCopy = nextCopy.next;
        }
        return result;
    }
}
