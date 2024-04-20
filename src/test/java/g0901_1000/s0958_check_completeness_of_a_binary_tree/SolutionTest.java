package g0901_1000.s0958_check_completeness_of_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isCompleteTree() {
        assertThat(
                new Solution().isCompleteTree(TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, 6))),
                equalTo(true));
    }

    @Test
    void isCompleteTree2() {
        assertThat(
                new Solution()
                        .isCompleteTree(TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, null, 7))),
                equalTo(false));
    }
}
