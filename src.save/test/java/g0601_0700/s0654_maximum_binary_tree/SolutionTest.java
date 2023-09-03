package g0601_0700.s0654_maximum_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructMaximumBinaryTree() {
        TreeNode expected = TreeNode.create(Arrays.asList(6, 3, 5, null, 2, 0, null, null, 1));
        assertThat(
                new Solution().constructMaximumBinaryTree(new int[] {3, 2, 1, 6, 0, 5}).toString(),
                equalTo(expected.toString()));
    }

    @Test
    void constructMaximumBinaryTree2() {
        TreeNode expected = TreeNode.create(Arrays.asList(3, null, 2, null, 1));
        assertThat(
                new Solution().constructMaximumBinaryTree(new int[] {3, 2, 1}).toString(),
                equalTo(expected.toString()));
    }
}
