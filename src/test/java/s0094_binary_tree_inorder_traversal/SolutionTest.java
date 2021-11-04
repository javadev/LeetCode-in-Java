package s0094_binary_tree_inorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void inorderTraversal() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.right = treeNode2;
        TreeNode treeNode3 = new TreeNode(3);
        treeNode2.left = treeNode3;
        assertThat(new Solution().inorderTraversal(treeNode).toString(), equalTo("[1, 3, 2]"));
    }
}
