package g0001_0100.s0082_remove_duplicates_from_sorted_list_ii;

import com_github_leetcode.ListNode;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = head;
        ListNode curr = head.next;
        while (curr != null) {
            boolean flagFoundDuplicate = false;
            while (curr != null && prev.next.val == curr.val) {
                flagFoundDuplicate = true;
                curr = curr.next;
            }
            if (flagFoundDuplicate) {
                prev.next = curr;
                if (curr != null) {
                    curr = curr.next;
                }
            } else {
                prev = prev.next;
                prev.next = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
