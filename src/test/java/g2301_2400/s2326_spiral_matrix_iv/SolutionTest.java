package g2301_2400.s2326_spiral_matrix_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void spiralMatrix() {
        ListNode listNode =
                LinkedListUtils.contructLinkedList(
                        new int[] {3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0});
        assertThat(
                new Solution().spiralMatrix(3, 5, listNode),
                equalTo(new int[][] {{3, 0, 2, 6, 8}, {5, 0, -1, -1, 1}, {5, 2, 4, 9, 7}}));
    }

    @Test
    void spiralMatrix2() {
        ListNode listNode = LinkedListUtils.contructLinkedList(new int[] {0, 1, 2});
        assertThat(
                new Solution().spiralMatrix(1, 4, listNode), equalTo(new int[][] {{0, 1, 2, -1}}));
    }
}
