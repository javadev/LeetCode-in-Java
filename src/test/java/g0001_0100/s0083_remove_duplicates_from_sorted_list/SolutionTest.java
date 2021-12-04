package g0001_0100.s0083_remove_duplicates_from_sorted_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deleteDuplicates() {
        ListNode head = new ListNode();
        ListNode node1 = new ListNode();
        node1.val = 1;
        head.next = node1;
        ListNode node2 = new ListNode();
        node2.val = 1;
        node1.next = node2;
        ListNode node3 = new ListNode();
        node3.val = 2;
        node2.next = node3;
        assertThat(new Solution().deleteDuplicates(node1).toString(), equalTo("1, 2"));
    }
}
