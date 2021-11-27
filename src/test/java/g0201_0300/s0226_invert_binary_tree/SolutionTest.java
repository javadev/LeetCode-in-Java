package g0201_0300.s0226_invert_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void invertTree() {
        TreeNode leftBottomLeft = new TreeNode(1);
        TreeNode leftBottomRight = new TreeNode(3);
        TreeNode left = new TreeNode(2, leftBottomLeft, leftBottomRight);
        TreeNode rightBottomLeft = new TreeNode(6);
        TreeNode rightBottomRight = new TreeNode(9);
        TreeNode right = new TreeNode(7, rightBottomLeft, rightBottomRight);
        TreeNode root = new TreeNode(4, left, right);
        TreeNode leftBottomLeftInverted = new TreeNode(9);
        TreeNode leftBottomRightInverted = new TreeNode(6);
        TreeNode leftInverted = new TreeNode(7, leftBottomLeftInverted, leftBottomRightInverted);
        TreeNode rightBottomLeftInverted = new TreeNode(3);
        TreeNode rightBottomRightInverted = new TreeNode(1);
        TreeNode rightInverted = new TreeNode(2, rightBottomLeftInverted, rightBottomRightInverted);
        TreeNode rootInverted = new TreeNode(4, leftInverted, rightInverted);
        assertThat(new Solution().invertTree(root).toString(), equalTo(rootInverted.toString()));
    }
}
