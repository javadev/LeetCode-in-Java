package g0801_0900.s0876_middle_of_the_linked_list;

// #Easy #Two_Pointers #Linked_List #Algorithm_I_Day_5_Two_Pointers
// #Programming_Skills_I_Day_10_Linked_List_and_Tree #Level_1_Day_4_Linked_List #Udemy_Linked_List
// #2022_03_28_Time_0_ms_(100.00%)_Space_42_MB_(26.38%)

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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
