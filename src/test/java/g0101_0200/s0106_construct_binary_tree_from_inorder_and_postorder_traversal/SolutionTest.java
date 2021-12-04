package g0101_0200.s0106_construct_binary_tree_from_inorder_and_postorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void constructBinaryTree() {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode actual = new Solution().buildTree(inorder, postorder);
        assertThat(actual.toString(), equalTo("3,9,20,15,7"));
    }
}
