package g0101_0200.s0111_minimum_depth_of_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDepth() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertThat(new Solution().minDepth(root), equalTo(2));
    }

    @Test
    void minDepth2() {
        TreeNode root =
                TreeUtils.constructBinaryTree(Arrays.asList(2, null, 3, null, 4, null, 5, null, 6));
        assertThat(new Solution().minDepth(root), equalTo(5));
    }
}
