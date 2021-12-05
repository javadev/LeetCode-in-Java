package g0001_0100.s0094_binary_tree_inorder_traversal_easy_top_100_liked_questions_top_interview_questions_depth_first_search_tree_binary_tree_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void inorderTraversal() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.right = treeNode2;
        treeNode2.left = new TreeNode(3);
        assertThat(new Solution().inorderTraversal(treeNode).toString(), equalTo("[1, 3, 2]"));
    }
}
