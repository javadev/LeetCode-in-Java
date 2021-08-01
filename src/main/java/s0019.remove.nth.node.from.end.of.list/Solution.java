package s0019.remove.nth.node.from.end.of.list;


public class Solution {
    int n;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        this.n = n;
        ListNode node = new ListNode(0, head);
        removeNth(node);

        return node.next;
    }

    private void removeNth(ListNode node) {
        if (node.next == null) return;

        removeNth(node.next);
        this.n--;

        if (this.n == 0) {
            node.next = node.next.next;
        }
    }
}
