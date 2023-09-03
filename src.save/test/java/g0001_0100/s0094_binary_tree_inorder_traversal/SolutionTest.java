package g0001_0100.s0094_binary_tree_inorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void inorderTraversal() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.right = treeNode2;
        treeNode2.left = new TreeNode(3);
        assertThat(new Solution().inorderTraversal(treeNode).toString(), equalTo("[1, 3, 2]"));
    }

    @Test
    void inorderTraversal2() {
        assertThat(new Solution().inorderTraversal(null).toString(), equalTo("[]"));
    }

    @Test
    void inorderTraversal3() {
        assertThat(new Solution().inorderTraversal(new TreeNode(1)).toString(), equalTo("[1]"));
    }
}
