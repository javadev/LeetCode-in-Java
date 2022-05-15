package g0201_0300.s0203_remove_linked_list_elements;

// #Easy #Linked_List #Recursion #Acceptance_43.6% #Data_Structure_I_Day_7_Linked_List
// #2022_03_04_Time_1_ms_(90.35%)_Space_49.2_MB_(24.46%)

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
