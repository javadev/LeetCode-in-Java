package g0001_0100.s0024_swap_nodes_in_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void swapPairs() {
        ListNode head = LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 2, 3, 4));
        assertThat(new Solution().swapPairs(head).toString(), equalTo("2, 1, 4, 3"));
    }

    @Test
    void swapPairs2() {
        assertThat(new Solution().swapPairs(new ListNode(1)).toString(), equalTo("1"));
    }
}
