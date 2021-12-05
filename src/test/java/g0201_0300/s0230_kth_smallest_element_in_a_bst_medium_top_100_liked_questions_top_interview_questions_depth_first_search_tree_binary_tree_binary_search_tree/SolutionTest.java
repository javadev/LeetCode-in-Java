package g0201_0300.s0230_kth_smallest_element_in_a_bst;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void kthSmallest() {
        TreeNode rightBottomLeft = new TreeNode(2);
        TreeNode left = new TreeNode(1, null, rightBottomLeft);
        TreeNode right = new TreeNode(4);
        TreeNode root = new TreeNode(3, left, right);
        assertThat(new Solution().kthSmallest(root, 1), equalTo(1));
    }
}
