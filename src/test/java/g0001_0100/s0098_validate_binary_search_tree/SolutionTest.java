package g0001_0100.s0098_validate_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isValidBST() {
        TreeNode treeNode1 = new TreeNode(2);
        treeNode1.left = new TreeNode(1);
        treeNode1.right = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(5);
        treeNode2.left = new TreeNode(1);
        treeNode2.right = new TreeNode(4);
        treeNode2.right.left = new TreeNode(3);
        treeNode2.right.right = new TreeNode(6);
        assertThat(new Solution().isValidBST(treeNode1), equalTo(true));
        assertThat(new Solution().isValidBST(treeNode2), equalTo(false));
    }
}
