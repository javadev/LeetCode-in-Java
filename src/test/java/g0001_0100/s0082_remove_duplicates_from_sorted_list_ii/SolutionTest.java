package g0001_0100.s0082_remove_duplicates_from_sorted_list_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deleteDuplicates() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 3, 4, 4, 5});
        assertThat(new Solution().deleteDuplicates(head).toString(), equalTo("1, 2, 5"));
    }

    @Test
    void deleteDuplicates2() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 1, 1, 2, 3});
        assertThat(new Solution().deleteDuplicates(head).toString(), equalTo("2, 3"));
    }
}
