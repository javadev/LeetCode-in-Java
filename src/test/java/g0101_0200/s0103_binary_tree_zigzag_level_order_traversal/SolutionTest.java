package g0101_0200.s0103_binary_tree_zigzag_level_order_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void zigzagLevelOrder() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertThat(
                new Solution().zigzagLevelOrder(root),
                equalTo(ArrayUtils.getLists(new int[][] {{3}, {20, 9}, {15, 7}})));
    }

    @Test
    void zigzagLevelOrder2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1));
        assertThat(
                new Solution().zigzagLevelOrder(root),
                equalTo(ArrayUtils.getLists(new int[][] {{1}})));
    }

    @Test
    void zigzagLevelOrder3() {
        assertThat(
                new Solution().zigzagLevelOrder(null),
                equalTo(ArrayUtils.getLists(new int[][] {})));
    }
}
