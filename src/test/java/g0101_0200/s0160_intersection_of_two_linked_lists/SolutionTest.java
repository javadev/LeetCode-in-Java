package g0101_0200.s0160_intersection_of_two_linked_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getIntersectionNode() {
        ListNode intersectionListNode = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode nodeA = new ListNode(4, new ListNode(1, intersectionListNode));
        ListNode nodeB = new ListNode(5, new ListNode(6, new ListNode(1, intersectionListNode)));
        assertThat(new Solution().getIntersectionNode(nodeA, nodeB).val, equalTo(8));
    }

    @Test
    void getIntersectionNode2() {
        ListNode nodeA = new ListNode(4, new ListNode(1, new ListNode(2)));
        ListNode nodeB = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(2))));
        assertThat(new Solution().getIntersectionNode(nodeA, nodeB), equalTo(null));
    }
}
