package g0101_0200.s0101_symmetric_tree_easy_top_100_liked_questions_top_interview_questions_depth_first_search_breadth_first_search_tree_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void symmetricTree() {
        TreeNode left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        TreeNode root = new TreeNode(1, left, right);
        assertThat(new Solution().isSymmetric(root), equalTo(true));
    }
}
