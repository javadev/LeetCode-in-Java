package g0001_0100.s0099_recover_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void recoverTree() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(2);
        new Solution().recoverTree(treeNode);
        assertThat(treeNode.toString(), equalTo("3,1,null,2,null"));
    }

    @Test
    void recoverTree2() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(2);
        new Solution().recoverTree(treeNode);
        assertThat(treeNode.toString(), equalTo("2,1,4,3,null"));
    }
}
