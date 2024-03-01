package g0001_0100.s0023_merge_k_sorted_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeKLists() {
        ListNode head1 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 4, 5));
        ListNode head2 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 3, 4));
        ListNode head3 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(2, 6));
        assertThat(
                new Solution().mergeKLists(new ListNode[] {head1, head2, head3}).toString(),
                equalTo("1, 1, 2, 3, 4, 4, 5, 6"));
    }

    @Test
    void mergeKLists2() {
        ListNode head1 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 3, 5, 7, 11));
        ListNode head2 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(2, 8, 12));
        ListNode head3 = LinkedListUtils.createSinglyLinkedList(Arrays.asList(4, 6, 9, 10));
        assertThat(
                new Solution().mergeKLists(new ListNode[] {head1, head2, head3}).toString(),
                equalTo("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12"));
    }
}
