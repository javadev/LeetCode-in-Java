package g0001_0100.s0083_remove_duplicates_from_sorted_list;

// #Easy #Linked_List #Data_Structure_I_Day_8_Linked_List
// #2022_02_21_Time_0_ms_(100.00%)_Space_41.7_MB_(36.90%)

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
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode next = current.next;
        while (null != next) {
            if (current.val == next.val) {
                current.next = next.next;
            } else {
                current = next;
            }
            next = current.next;
        }
        return head;
    }
}
