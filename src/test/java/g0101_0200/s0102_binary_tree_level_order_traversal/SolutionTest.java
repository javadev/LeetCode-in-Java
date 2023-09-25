package g0101_0200.s0102_binary_tree_level_order_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void levelOrder() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertThat(
                new Solution().levelOrder(root),
                equalTo(ArrayUtils.getLists(new int[][] {{3}, {9, 20}, {15, 7}})));
    }

    @Test
    void levelOrder2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1));
        assertThat(
                new Solution().levelOrder(root), equalTo(ArrayUtils.getLists(new int[][] {{1}})));
    }

    @Test
    void levelOrder3() {
        assertThat(new Solution().levelOrder(null), equalTo(ArrayUtils.getLists(new int[][] {})));
    }
}
