package g0101_0200.s0141_linked_list_cycle_easy_top_100_liked_questions_top_interview_questions_hash_table_two_pointers_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void hasCycle() {
        ListNode listNode1 = new ListNode(3);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(0);
        listNode1.next.next.next = new ListNode(-4);
        listNode1.next.next.next.next = listNode1.next;
        assertThat(new Solution().hasCycle(listNode1), equalTo(true));
    }
}
