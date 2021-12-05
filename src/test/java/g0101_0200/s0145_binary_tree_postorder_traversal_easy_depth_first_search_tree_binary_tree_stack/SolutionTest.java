package g0101_0200.s0145_binary_tree_postorder_traversal_easy_depth_first_search_tree_binary_tree_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void postorderTraversal() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        assertThat(new Solution().postorderTraversal(treeNode), equalTo(Arrays.asList(3, 2, 1)));
    }
}
