package g0101_0200.s0102_binary_tree_level_order_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void levelOrder() {
        TreeNode left = new TreeNode(9, null, null);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, right);
        assertThat(
                new Solution().levelOrder(root),
                equalTo(ArrayUtils.getLists(new int[][] {{3}, {9, 20}, {15, 7}})));
    }
}
