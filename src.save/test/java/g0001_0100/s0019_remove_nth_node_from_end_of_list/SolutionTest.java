package g0001_0100.s0019_remove_nth_node_from_end_of_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeNthFromEnd() {
        ListNode node1 = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5});
        assertThat(new Solution().removeNthFromEnd(node1, 2).toString(), equalTo("1, 2, 3, 5"));
    }

    @Test
    void removeNthFromEnd2() {
        ListNode node1 = new ListNode();
        node1.val = 1;
        assertThat(new Solution().removeNthFromEnd(node1, 1), equalTo(null));
    }
}
