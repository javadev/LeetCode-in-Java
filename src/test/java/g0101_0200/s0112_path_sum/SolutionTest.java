package g0101_0200.s0112_path_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void pathSum() {
        TreeNode fourthLevelLeftMostLeft = new TreeNode(7);
        TreeNode fourthLevelLeftMostRight = new TreeNode(2);

        TreeNode thirtLevelLeftMostRoot =
                new TreeNode(11, fourthLevelLeftMostLeft, fourthLevelLeftMostRight);

        TreeNode secondLevelLeftMostRoot = new TreeNode(4, thirtLevelLeftMostRoot, null);

        TreeNode fourthLevelRightMostRight = new TreeNode(1);
        TreeNode thirdLevelRightRoot = new TreeNode(4, fourthLevelRightMostRight, null);
        TreeNode thirdLevelLeftRoot = new TreeNode(13);

        TreeNode secondLevelRightRoot = new TreeNode(8, thirdLevelLeftRoot, thirdLevelRightRoot);

        TreeNode root = new TreeNode(5, secondLevelLeftMostRoot, secondLevelRightRoot);

        assertThat(new Solution().hasPathSum(root, 22), equalTo(true));
    }
}
