package g2101_2200.s2181_merge_nodes_in_between_zeros;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeNodes() {
        ListNode head =
                LinkedListUtils.createSinglyLinkedList(Arrays.asList(0, 3, 1, 0, 4, 5, 2, 0));
        assertThat(new Solution().mergeNodes(head).toString(), equalTo("4, 11"));
    }

    @Test
    void mergeNodes2() {
        ListNode head =
                LinkedListUtils.createSinglyLinkedList(Arrays.asList(0, 1, 0, 3, 0, 2, 2, 0));
        assertThat(new Solution().mergeNodes(head).toString(), equalTo("1, 3, 4"));
    }
}
