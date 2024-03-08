package g0001_0100.s0098_validate_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isValidBST() {
        TreeNode treeNode1 = new TreeNode(2);
        treeNode1.left = new TreeNode(1);
        treeNode1.right = new TreeNode(3);
        assertThat(new Solution().isValidBST(treeNode1), equalTo(true));
    }

    @Test
    void isValidBST2() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(3);
        treeNode.right.right = new TreeNode(6);
        assertThat(new Solution().isValidBST(treeNode), equalTo(false));
    }
}
