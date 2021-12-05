package g0101_0200.s0199_binary_tree_right_side_view;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rightSideView() {
        TreeNode left = new TreeNode(2, null, new TreeNode(5));
        TreeNode right = new TreeNode(3, null, new TreeNode(4));
        TreeNode root = new TreeNode(1, left, right);
        assertThat(new Solution().rightSideView(root), equalTo(Arrays.asList(1, 3, 4)));
    }

    @Test
    void rightSideView2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(3));
        assertThat(new Solution().rightSideView(root), equalTo(Arrays.asList(1, 3)));
    }
}
