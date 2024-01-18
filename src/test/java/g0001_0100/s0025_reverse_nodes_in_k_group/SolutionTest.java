package g0001_0100.s0025_reverse_nodes_in_k_group;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseKGroup() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5});
        assertThat(new Solution().reverseKGroup(head, 2).toString(), equalTo("2, 1, 4, 3, 5"));
    }

    @Test
    void reverseKGroup2() {
        ListNode head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5});
        assertThat(new Solution().reverseKGroup(head, 3).toString(), equalTo("3, 2, 1, 4, 5"));
    }
}
