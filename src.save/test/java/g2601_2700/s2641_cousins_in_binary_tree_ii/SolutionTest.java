package g2601_2700.s2641_cousins_in_binary_tree_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void replaceValueInTree() {
        assertThat(
                new Solution()
                        .replaceValueInTree(TreeNode.create(Arrays.asList(5, 4, 9, 1, 10, null, 7)))
                        .toString(),
                equalTo(TreeNode.create(Arrays.asList(0, 0, 0, 7, 7, null, 11)).toString()));
    }

    @Test
    void replaceValueInTree2() {
        assertThat(
                new Solution()
                        .replaceValueInTree(TreeNode.create(Arrays.asList(3, 1, 2)))
                        .toString(),
                equalTo(TreeNode.create(Arrays.asList(0, 0, 0)).toString()));
    }
}
