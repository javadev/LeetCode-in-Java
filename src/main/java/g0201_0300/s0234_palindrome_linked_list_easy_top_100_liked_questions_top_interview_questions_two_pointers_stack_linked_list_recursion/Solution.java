package g0201_0300.s0234_palindrome_linked_list_easy_top_100_liked_questions_top_interview_questions_two_pointers_stack_linked_list_recursion;

import com_github_leetcode.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode right = head;
        // Culculate the length
        while (right != null) {
            right = right.next;
            len++;
        }
        // Reverse the right half of the list
        len = len / 2;
        right = head;
        for (int i = 0; i < len; i++) {
            right = right.next;
        }
        ListNode prev = null;
        while (right != null) {
            ListNode next = right.next;
            right.next = prev;
            prev = right;
            right = next;
        }
        // Compare left half and right half
        for (int i = 0; i < len; i++) {
            if (prev != null && head.val == prev.val) {
                head = head.next;
                prev = prev.next;
            } else {
                return false;
            }
        }
        return true;
    }
}
