package g0101_0200.s0124_binary_tree_maximum_path_sum_hard_top_100_liked_questions_top_interview_questions_dynamic_programming_depth_first_search_tree_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findMaxPathSum() {
        TreeNode treeNode = TreeNode.create(new int[] {1, 2, 3});
        assertThat(new Solution().findMaxPathSum(treeNode), equalTo(6));
    }
}
