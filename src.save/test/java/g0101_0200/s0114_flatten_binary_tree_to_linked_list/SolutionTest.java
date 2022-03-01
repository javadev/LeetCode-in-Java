package g0101_0200.s0114_flatten_binary_tree_to_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void flattenBinaryTreetoLinkedList() {
        TreeNode leftMostLeft = new TreeNode(3);
        TreeNode leftMostRight = new TreeNode(4);
        TreeNode leftRoot = new TreeNode(2, leftMostLeft, leftMostRight);

        TreeNode rightMostRight = new TreeNode(6);
        TreeNode rightRoot = new TreeNode(5, null, rightMostRight);

        TreeNode root = new TreeNode(1, leftRoot, rightRoot);

        new Solution().flatten(root);

        assertThat(root.toString(), equalTo("1,null,2,null,3,null,4,null,5,null,6"));
    }
}
