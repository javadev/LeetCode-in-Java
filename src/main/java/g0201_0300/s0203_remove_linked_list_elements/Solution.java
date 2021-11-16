package g0201_0300.s0203_remove_linked_list_elements;

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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode r = head;
        ListNode t = head;
        while (r != null) {
            if (r.val == val) {
                t.next = r.next;
            } else {
                t = r;
            }
            r = r.next;
        }
        return head;
    }
}
