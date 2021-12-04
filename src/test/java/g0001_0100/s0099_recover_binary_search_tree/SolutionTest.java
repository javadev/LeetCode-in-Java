package g0001_0100.s0099_recover_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void recoverTree() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(3);
        treeNode1.left.right = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode2.left = new TreeNode(1);
        treeNode2.right = new TreeNode(4);
        treeNode2.right.left = new TreeNode(2);
        new Solution().recoverTree(treeNode1);
        new Solution().recoverTree(treeNode2);
        assertThat(treeNode1.toString(), equalTo("3,1,null,2,null"));
        assertThat(treeNode2.toString(), equalTo("2,1,4,3,null"));
    }
}
