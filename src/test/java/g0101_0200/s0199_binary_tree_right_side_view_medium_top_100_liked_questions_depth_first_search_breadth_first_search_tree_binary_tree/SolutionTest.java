package g0101_0200.s0199_binary_tree_right_side_view_medium_top_100_liked_questions_depth_first_search_breadth_first_search_tree_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void rightSideView() {
        TreeNode left = new TreeNode(2, null, new TreeNode(5));
        TreeNode right = new TreeNode(3, null, new TreeNode(4));
        TreeNode root = new TreeNode(1, left, right);
        assertThat(new Solution().rightSideView(root), equalTo(Arrays.asList(1, 3, 4)));
    }

    @Test
    public void rightSideView2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(3));
        assertThat(new Solution().rightSideView(root), equalTo(Arrays.asList(1, 3)));
    }
}
