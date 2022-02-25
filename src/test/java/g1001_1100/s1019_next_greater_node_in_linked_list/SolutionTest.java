package g1001_1100.s1019_next_greater_node_in_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nextLargerNodes() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {2, 1, 5});
        assertThat(new Solution().nextLargerNodes(head), equalTo(new int[] {5, 5, 0}));
    }

    @Test
    void nextLargerNodes2() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {2, 7, 4, 3, 5});
        assertThat(new Solution().nextLargerNodes(head), equalTo(new int[] {7, 0, 5, 5, 0}));
    }
}
