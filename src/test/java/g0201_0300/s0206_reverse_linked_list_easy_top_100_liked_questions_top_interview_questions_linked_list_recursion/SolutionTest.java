package g0201_0300.s0206_reverse_linked_list_easy_top_100_liked_questions_top_interview_questions_linked_list_recursion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void reverseList() {
        ListNode headActual = new ListNode(1);
        headActual.next = new ListNode(2);
        headActual.next.next = new ListNode(3);
        headActual.next.next.next = new ListNode(4);
        headActual.next.next.next.next = new ListNode(5);
        assertThat(new Solution().reverseList(headActual).toString(), equalTo("5, 4, 3, 2, 1"));
    }
}
