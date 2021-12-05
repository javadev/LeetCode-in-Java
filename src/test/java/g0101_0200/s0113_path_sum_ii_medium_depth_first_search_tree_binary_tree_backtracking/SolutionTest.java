package g0101_0200.s0113_path_sum_ii_medium_depth_first_search_tree_binary_tree_backtracking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void pathSum() {
        TreeNode fourthLevelLeftMostLeft = new TreeNode(7);
        TreeNode fourthLevelLeftMostRight = new TreeNode(2);

        TreeNode thirtLevelLeftMostRoot =
                new TreeNode(11, fourthLevelLeftMostLeft, fourthLevelLeftMostRight);

        TreeNode secondLevelLeftMostRoot = new TreeNode(4, thirtLevelLeftMostRoot, null);

        TreeNode fourthLevelRightMostRight = new TreeNode(1);
        TreeNode fourthLevelRightMostLeft = new TreeNode(5);

        TreeNode thirdLevelRightRoot =
                new TreeNode(4, fourthLevelRightMostRight, fourthLevelRightMostLeft);
        TreeNode thirdLevelLeftRoot = new TreeNode(13);

        TreeNode secondLevelRightRoot = new TreeNode(8, thirdLevelLeftRoot, thirdLevelRightRoot);

        TreeNode root = new TreeNode(5, secondLevelLeftMostRoot, secondLevelRightRoot);
        assertThat(
                new Solution().pathSum(root, 22),
                equalTo(ArrayUtils.getLists(new int[][] {{5, 4, 11, 2}, {5, 8, 4, 5}})));
    }
}
