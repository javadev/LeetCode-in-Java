package g0901_1000.s0987_vertical_order_traversal_of_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void verticalTraversal() {
        assertThat(
                new Solution()
                        .verticalTraversal(
                                TreeUtils.constructBinaryTree(
                                        Arrays.asList(3, 9, 20, null, null, 15, 7))),
                equalTo(ArrayUtils.getLists(new int[][] {{9}, {3, 15}, {20}, {7}})));
    }

    @Test
    void verticalTraversal2() {
        assertThat(
                new Solution()
                        .verticalTraversal(
                                TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7))),
                equalTo(ArrayUtils.getLists(new int[][] {{4}, {2}, {1, 5, 6}, {3}, {7}})));
    }
}
