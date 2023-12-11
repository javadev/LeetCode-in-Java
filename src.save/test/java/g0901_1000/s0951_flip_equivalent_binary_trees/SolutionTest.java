package g0901_1000.s0951_flip_equivalent_binary_trees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void flipEquiv() {
        TreeNode root1 =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(1, 2, 3, 4, 5, 6, null, null, null, 7, 8));
        TreeNode root2 =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7));
        assertThat(new Solution().flipEquiv(root1, root2), equalTo(true));
    }

    @Test
    void flipEquiv2() {
        TreeNode root1 = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeNode root2 = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 4));
        assertThat(new Solution().flipEquiv(root1, root2), equalTo(false));
    }
}
