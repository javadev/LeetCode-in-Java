package g0001_0100.s0019_remove_nth_node_from_end_of_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeNthFromEnd() {
        ListNode node1 = new ListNode();
        node1.val = 1;
        ListNode node2 = new ListNode();
        node2.val = 2;
        node1.next = node2;
        ListNode node3 = new ListNode();
        node3.val = 3;
        node2.next = node3;
        ListNode node4 = new ListNode();
        node4.val = 4;
        node3.next = node4;
        ListNode node5 = new ListNode();
        node5.val = 5;
        node4.next = node5;
        assertThat(new Solution().removeNthFromEnd(node1, 2).toString(), equalTo("1, 2, 3, 5"));
    }

    @Test
    void removeNthFromEnd2() {
        ListNode node1 = new ListNode();
        node1.val = 1;
        assertThat(new Solution().removeNthFromEnd(node1, 1), equalTo(null));
    }
}
