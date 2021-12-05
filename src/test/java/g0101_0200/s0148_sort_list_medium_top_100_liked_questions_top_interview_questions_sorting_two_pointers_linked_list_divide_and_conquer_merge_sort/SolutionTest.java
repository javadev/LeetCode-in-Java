package g0101_0200.s0148_sort_list_medium_top_100_liked_questions_top_interview_questions_sorting_two_pointers_linked_list_divide_and_conquer_merge_sort;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void sortList() {
        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(1);
        listNode1.next.next.next = new ListNode(3);
        assertThat(new Solution().sortList(listNode1).toString(), equalTo("1, 2, 3, 4"));
    }
}
