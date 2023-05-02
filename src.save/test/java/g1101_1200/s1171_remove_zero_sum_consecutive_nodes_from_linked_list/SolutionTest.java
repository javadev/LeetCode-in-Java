package g1101_1200.s1171_remove_zero_sum_consecutive_nodes_from_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeZeroSumSublists() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 2, -3, 3, 1});
        ListNode expected = LinkedListUtils.contructLinkedList(new int[] {3, 1});
        assertThat(
                new Solution().removeZeroSumSublists(head).toString(),
                equalTo(expected.toString()));
    }

    @Test
    void removeZeroSumSublists2() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, -3, 4});
        ListNode expected = LinkedListUtils.contructLinkedList(new int[] {1, 2, 4});
        assertThat(
                new Solution().removeZeroSumSublists(head).toString(),
                equalTo(expected.toString()));
    }

    @Test
    void removeZeroSumSublists3() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, -3, -2});
        ListNode expected = LinkedListUtils.contructLinkedList(new int[] {1});
        assertThat(
                new Solution().removeZeroSumSublists(head).toString(),
                equalTo(expected.toString()));
    }
}
