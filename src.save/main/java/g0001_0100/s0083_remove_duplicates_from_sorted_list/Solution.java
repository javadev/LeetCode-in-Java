package g0001_0100.s0083_remove_duplicates_from_sorted_list;

// #Easy #Linked_List #Data_Structure_I_Day_8_Linked_List
// #2022_06_20_Time_0_ms_(100.00%)_Space_44_MB_(64.59%)

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
