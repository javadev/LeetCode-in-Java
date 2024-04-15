package g0901_1000.s0965_univalued_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isUnivalTree() {
        assertThat(
                new Solution().isUnivalTree(TreeNode.create(Arrays.asList(1, 1, 1, 1, 1, null, 1))),
                equalTo(true));
    }

    @Test
    void isUnivalTree2() {
        assertThat(
                new Solution().isUnivalTree(TreeNode.create(Arrays.asList(2, 2, 2, 5, 2))),
                equalTo(false));
    }
}
