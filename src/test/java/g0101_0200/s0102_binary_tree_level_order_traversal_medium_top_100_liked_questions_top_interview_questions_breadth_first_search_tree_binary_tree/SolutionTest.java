package g0101_0200.s0102_binary_tree_level_order_traversal_medium_top_100_liked_questions_top_interview_questions_breadth_first_search_tree_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void levelOrder() {
        TreeNode left = new TreeNode(9, null, null);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, right);
        assertThat(
                new Solution().levelOrder(root),
                equalTo(ArrayUtils.getLists(new int[][] {{3}, {9, 20}, {15, 7}})));
    }
}
