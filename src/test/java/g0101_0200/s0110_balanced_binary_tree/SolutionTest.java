package g0101_0200.s0110_balanced_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void balancedBinaryTree() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertThat(new Solution().isBalanced(root), equalTo(true));
    }

    @Test
    void balancedBinaryTree2() {
        TreeNode root =
                TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 2, 3, 3, null, null, 4, 4));
        assertThat(new Solution().isBalanced(root), equalTo(false));
    }

    @Test
    void balancedBinaryTree3() {
        assertThat(new Solution().isBalanced(null), equalTo(true));
    }
}
