package g0101_0200.s0106_construct_binary_tree_from_inorder_and_postorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructBinaryTree() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode actual = new Solution().buildTree(inorder, postorder);
        assertThat(actual.toString(), equalTo("3,9,20,15,7"));
    }

    @Test
    void constructBinaryTree2() {
        int[] inorder = {-1};
        int[] postorder = {-1};
        TreeNode actual = new Solution().buildTree(inorder, postorder);
        assertThat(actual.toString(), equalTo("-1"));
    }
}
