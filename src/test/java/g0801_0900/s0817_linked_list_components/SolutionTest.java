package g0801_0900.s0817_linked_list_components;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numComponents() {
        ListNode listNode = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
        assertThat(new Solution().numComponents(listNode, new int[] {0, 1, 3}), equalTo(2));
    }

    @Test
    void numComponents2() {
        ListNode listNode =
                new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        assertThat(new Solution().numComponents(listNode, new int[] {0, 3, 1, 4}), equalTo(2));
    }
}
