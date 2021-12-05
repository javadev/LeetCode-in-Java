package g0101_0200.s0147_insertion_sort_list_medium_sorting_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void insertionSortList() {
        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(1);
        listNode1.next.next.next = new ListNode(3);
        assertThat(new Solution().insertionSortList(listNode1).toString(), equalTo("1, 2, 3, 4"));
    }
}
