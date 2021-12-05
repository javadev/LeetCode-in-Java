package g0101_0200.s0129_sum_root_to_leaf_numbers_medium_depth_first_search_tree_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void sumNumbers() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        assertThat(new Solution().sumNumbers(treeNode), equalTo(25));
    }
}
