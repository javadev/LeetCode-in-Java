package g0201_0300.s0235_lowest_common_ancestor_of_a_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lowestCommonAncestor() {
        TreeNode leftNodeLeftNode = new TreeNode(0);
        TreeNode leftNodeRightNode = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        TreeNode leftNode = new TreeNode(2, leftNodeLeftNode, leftNodeRightNode);
        TreeNode rightNode = new TreeNode(6, new TreeNode(7), new TreeNode(9));
        TreeNode root = new TreeNode(6, leftNode, rightNode);
        assertThat(
                new Solution().lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)).val,
                equalTo(6));
    }

    @Test
    void lowestCommonAncestor2() {
        TreeNode leftNodeLeftNode = new TreeNode(0);
        TreeNode leftNodeRightNode = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        TreeNode leftNode = new TreeNode(2, leftNodeLeftNode, leftNodeRightNode);
        TreeNode rightNode = new TreeNode(6, new TreeNode(7), new TreeNode(9));
        TreeNode root = new TreeNode(6, leftNode, rightNode);
        assertThat(
                new Solution().lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)).val,
                equalTo(2));
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
