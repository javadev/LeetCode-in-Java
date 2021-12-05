package g0001_0100.s0100_same_tree_easy_depth_first_search_breadth_first_search_tree_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isSameTree() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);
        treeNode1.right = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(1);
        treeNode3.left = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(1);
        treeNode4.right = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(1);
        treeNode5.left = new TreeNode(2);
        treeNode5.right = new TreeNode(1);
        TreeNode treeNode6 = new TreeNode(1);
        treeNode6.left = new TreeNode(1);
        treeNode6.right = new TreeNode(2);
        assertThat(new Solution().isSameTree(treeNode1, treeNode2), equalTo(true));
        assertThat(new Solution().isSameTree(treeNode3, treeNode4), equalTo(false));
        assertThat(new Solution().isSameTree(treeNode5, treeNode6), equalTo(false));
    }
}
