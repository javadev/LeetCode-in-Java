package g0201_0300.s0222_count_complete_tree_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void countNodes() {
        TreeNode leftNodeLeftNode = new TreeNode(4);
        TreeNode leftNodeRightNode = new TreeNode(5);
        TreeNode leftNode = new TreeNode(2, leftNodeLeftNode, leftNodeRightNode);
        TreeNode rightNodeLeftNode = new TreeNode(6);
        TreeNode rightNode = new TreeNode(3, rightNodeLeftNode, null);
        TreeNode root = new TreeNode(1, leftNode, rightNode);
        assertThat(new Solution().countNodes(root), equalTo(6));
    }
}
