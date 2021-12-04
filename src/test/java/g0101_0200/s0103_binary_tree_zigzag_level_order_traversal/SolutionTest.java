package g0101_0200.s0103_binary_tree_zigzag_level_order_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void zigzagLevelOrder() {
        TreeNode left = new TreeNode(9, null, null);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, right);
        assertThat(
                new Solution().zigzagLevelOrder(root),
                equalTo(ArrayUtils.getLists(new int[][] {{3}, {20, 9}, {15, 7}})));
    }
}
