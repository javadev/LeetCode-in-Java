package g0101_0200.s0107_binary_tree_level_order_traversal_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void levelOrderBottom() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertThat(
                new Solution().levelOrderBottom(root),
                equalTo(ArrayUtils.getLists(new int[][] {{15, 7}, {9, 20}, {3}})));
    }

    @Test
    void levelOrderBottom2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1));
        assertThat(
                new Solution().levelOrderBottom(root),
                equalTo(ArrayUtils.getLists(new int[][] {{1}})));
    }

    @Test
    void levelOrderBottom3() {
        assertThat(
                new Solution().levelOrderBottom(null),
                equalTo(ArrayUtils.getLists(new int[][] {})));
    }
}
