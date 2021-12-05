package g0201_0300.s0234_palindrome_linked_list_easy_top_100_liked_questions_top_interview_questions_two_pointers_stack_linked_list_recursion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isPalindrome() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        headActual.next.next = new ListNode(2);
        headActual.next.next.next = new ListNode(1);
        assertThat(new Solution().isPalindrome(headActual), equalTo(true));
    }

    @Test
    public void isPalindrome2() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        assertThat(new Solution().isPalindrome(headActual), equalTo(false));
    }
}
