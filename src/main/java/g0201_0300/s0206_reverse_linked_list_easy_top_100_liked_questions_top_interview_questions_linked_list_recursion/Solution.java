package g0201_0300.s0206_reverse_linked_list_easy_top_100_liked_questions_top_interview_questions_linked_list_recursion;

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
