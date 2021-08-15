package s0023.merge.k.sorted.lists;

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
        String result = "" + val;
        if (next.next != null) {
            result += ", ";
        }
        ListNode current = next;
        while (current.next != null) {
            result += current.val;
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }
        result += current.val;
        return result;
    }
}
