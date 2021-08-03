package s0021.merge.two.sorted.lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void mergeTwoLists() {
        ListNode head = new ListNode();
        ListNode node1 = new ListNode();
        node1.val = 1;
        head.next = node1;
        ListNode node2 = new ListNode();
        node2.val = 2;
        node1.next = node2;
        ListNode node3 = new ListNode();
        node3.val = 4;
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
        assertThat(
                new Solution().mergeTwoLists(node1, node4).toString(), equalTo("1, 1, 2, 3, 4, 4"));
    }
}
