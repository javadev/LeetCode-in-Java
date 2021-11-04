package g0001_0100.s0082_remove_duplicates_from_sorted_list_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void deleteDuplicates() {
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
        node4.val = 3;
        node3.next = node4;
        ListNode node5 = new ListNode();
        node5.val = 4;
        node4.next = node5;
        ListNode node6 = new ListNode();
        node6.val = 4;
        node5.next = node6;
        ListNode node7 = new ListNode();
        node7.val = 5;
        node6.next = node7;
        assertThat(new Solution().deleteDuplicates(node1).toString(), equalTo("1, 2, 5"));
    }
}
