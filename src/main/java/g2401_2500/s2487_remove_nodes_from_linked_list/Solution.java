package g2401_2500.s2487_remove_nodes_from_linked_list;

// #Medium #Stack #Linked_List #Monotonic_Stack #Recursion
// #2023_01_26_Time_5_ms_(99.79%)_Space_67_MB_(74.44%)

import com_github_leetcode.ListNode;

public class Solution {
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        if (head == null) {
            return null;
        }
        int max = head.val;
        ListNode temp = head;
        ListNode temp1 = head.next;
        while (temp1 != null) {
            if (temp1.val >= max) {
                max = temp1.val;
                temp.next = temp1;
                temp = temp.next;
            }
            temp1 = temp1.next;
        }
        temp.next = null;
        return reverse(head);
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
