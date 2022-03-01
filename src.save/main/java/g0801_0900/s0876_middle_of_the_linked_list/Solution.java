package g0801_0900.s0876_middle_of_the_linked_list;

// #Easy #Two_Pointers #Linked_List

import com_github_leetcode.ListNode;

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
