package s0024.swap.nodes.in.pairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        int len = getLength(head);
        return reverse(head, len);
    }

    private int getLength(ListNode curr) {
        int cnt = 0;
        while (curr != null) {
            cnt++;
            curr = curr.next;
        }
        return cnt;
    }

    // Recursive function to reverse in groups
    private ListNode reverse(ListNode head, int len) {
        // base case
        if (len < 2) return head;

        ListNode curr = head, prev = null, next = null;
        for (int i = 0; i < 2; i++) {
            // reverse linked list code
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode nextNode = reverse(curr, len - 2);
        head.next = nextNode;
        return prev;
    }
}
