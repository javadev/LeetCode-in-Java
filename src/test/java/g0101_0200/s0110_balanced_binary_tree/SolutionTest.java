package g0101_0200.s0110_balanced_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void balancedBinaryTree() {
        TreeNode bottomLeft = new TreeNode(15);
        TreeNode bottomRight = new TreeNode(7);

        TreeNode upRight = new TreeNode(20, bottomLeft, bottomRight);
        TreeNode upLeft = new TreeNode(9);
        TreeNode root = new TreeNode(3, upLeft, upRight);
        assertThat(new Solution().isBalanced(root), equalTo(true));
    }
}
