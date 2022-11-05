package g0501_0600.s0543_diameter_of_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void diameterOfBinaryTree() {
        assertThat(
                new Solution().diameterOfBinaryTree(TreeNode.create(Arrays.asList(1, 2, 3, 4, 5))),
                equalTo(3));
    }

    @Test
    void diameterOfBinaryTree2() {
        assertThat(
                new Solution().diameterOfBinaryTree(TreeNode.create(Arrays.asList(1, 2))),
                equalTo(1));
    }
}
