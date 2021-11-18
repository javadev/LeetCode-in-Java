package g0101_0200.s0160_intersection_of_two_linked_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void getIntersectionNode() {
        ListNode intersectionListNode = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode nodeA = new ListNode(4, new ListNode(1, intersectionListNode));
        ListNode nodeB = new ListNode(5, new ListNode(6, new ListNode(1, intersectionListNode)));

        int intersectVal = 8;
        int skipA = 2;
        int skipB = 3;

        for (int i = 0; i < skipB; i++) {
            if (i < skipA) {
                nodeA = nodeA.next;
            }
            nodeB = nodeB.next;
        }
        assertThat(new Solution().getIntersectionNode(nodeA, nodeB).val, equalTo(intersectVal));
    }
}
