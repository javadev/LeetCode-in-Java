package g0101_0200.s0105_construct_binary_tree_from_preorder_and_inorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void constructBinaryTree() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode actual = new Solution().buildTree(preorder, inorder);
        assertThat(actual.toString(), equalTo("3,9,20,15,7"));
    }
}
