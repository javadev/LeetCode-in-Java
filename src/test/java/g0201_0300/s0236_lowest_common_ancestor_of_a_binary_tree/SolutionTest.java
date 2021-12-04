package g0201_0300.s0236_lowest_common_ancestor_of_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lowestCommonAncestor() {
        TreeNode leftNodeLeftNode = new TreeNode(6);
        TreeNode leftNodeRightNode = new TreeNode(2, new TreeNode(7), new TreeNode(4));
        TreeNode leftNode = new TreeNode(5, leftNodeLeftNode, leftNodeRightNode);
        TreeNode rightNode = new TreeNode(1, new TreeNode(0), new TreeNode(8));
        TreeNode root = new TreeNode(3, leftNode, rightNode);
        assertThat(
                new Solution().lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1)).val,
                equalTo(3));
    }

    @Test
    void lowestCommonAncestor2() {
        TreeNode leftNodeLeftNode = new TreeNode(6);
        TreeNode leftNodeRightNode = new TreeNode(2, new TreeNode(7), new TreeNode(4));
        TreeNode leftNode = new TreeNode(5, leftNodeLeftNode, leftNodeRightNode);
        TreeNode rightNode = new TreeNode(1, new TreeNode(0), new TreeNode(8));
        TreeNode root = new TreeNode(3, leftNode, rightNode);
        assertThat(
                new Solution().lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4)).val,
                equalTo(5));
    }

    @Test
    void lowestCommonAncestor3() {
        assertThat(
                new Solution()
                        .lowestCommonAncestor(
                                new TreeNode(2, new TreeNode(1), null),
                                new TreeNode(2),
                                new TreeNode(1))
                        .val,
                equalTo(2));
    }
}
