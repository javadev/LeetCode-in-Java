package g0201_0300.s0234_palindrome_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPalindrome() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        headActual.next.next = new ListNode(2);
        headActual.next.next.next = new ListNode(1);
        assertThat(new Solution().isPalindrome(headActual), equalTo(true));
    }

    @Test
    void isPalindrome2() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        assertThat(new Solution().isPalindrome(headActual), equalTo(false));
    }
}
