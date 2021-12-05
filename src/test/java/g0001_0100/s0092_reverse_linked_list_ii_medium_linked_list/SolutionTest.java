package g0001_0100.s0092_reverse_linked_list_ii_medium_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void reverseBetween() {
        ListNode head = new ListNode();
        ListNode node1 = new ListNode();
        node1.val = 1;
        head.next = node1;
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
        assertThat(new Solution().reverseBetween(node1, 2, 4).toString(), equalTo("1, 4, 3, 2, 5"));
    }
}
