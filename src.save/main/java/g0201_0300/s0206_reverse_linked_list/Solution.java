package g0201_0300.s0206_reverse_linked_list;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Linked_List #Recursion

import com_github_leetcode.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
