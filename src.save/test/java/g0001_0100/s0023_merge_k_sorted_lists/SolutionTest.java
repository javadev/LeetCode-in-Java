package g0001_0100.s0023_merge_k_sorted_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeKLists() {
        ListNode head = new ListNode();
        ListNode node1 = new ListNode();
        node1.val = 1;
        head.next = node1;
        ListNode node2 = new ListNode();
        node2.val = 4;
        node1.next = node2;
        ListNode node3 = new ListNode();
        node3.val = 5;
        node2.next = node3;
        ListNode head2 = new ListNode();
        ListNode node4 = new ListNode();
        node4.val = 1;
        head2.next = node4;
        ListNode node5 = new ListNode();
        node5.val = 3;
        node4.next = node5;
        ListNode node6 = new ListNode();
        node6.val = 4;
        node5.next = node6;
        ListNode head3 = new ListNode();
        ListNode node7 = new ListNode();
        node7.val = 2;
        head3.next = node7;
        ListNode node8 = new ListNode();
        node8.val = 6;
        node7.next = node8;
        assertThat(
                new Solution().mergeKLists(new ListNode[] {node1, node4, node7}).toString(),
                equalTo("1, 1, 2, 3, 4, 4, 5, 6"));
    }
}
