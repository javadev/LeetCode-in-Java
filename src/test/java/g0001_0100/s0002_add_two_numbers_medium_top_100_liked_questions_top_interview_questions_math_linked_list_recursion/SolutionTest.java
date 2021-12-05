package g0001_0100.s0002_add_two_numbers_medium_top_100_liked_questions_top_interview_questions_math_linked_list_recursion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void addTwoNumbers() {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);
        assertThat(
                new Solution().addTwoNumbers(listNode1, listNode2).toString(), equalTo("7, 0, 8"));
    }
}
