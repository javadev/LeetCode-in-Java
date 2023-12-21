package g2301_2400.s2331_evaluate_boolean_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void evaluateTree() {
        assertThat(
                new Solution()
                        .evaluateTree(TreeNode.create(Arrays.asList(2, 1, 3, null, null, 0, 1))),
                equalTo(true));
    }

    @Test
    void evaluateTree2() {
        assertThat(
                new Solution().evaluateTree(TreeNode.create(Collections.singletonList(0))),
                equalTo(false));
    }

    @Test
    void evaluateTree3() {
        assertThat(
                new Solution()
                        .evaluateTree(
                                TreeNode.create(
                                        Arrays.asList(
                                                3, 2, 2, 2, 2, 3, 2, 0, 0, 0, 1, 1, 2, 1, 1, null,
                                                null, null, null, null, null, null, null, null,
                                                null, 3, 2, null, null, null, null, 2, 3, 0, 0, 1,
                                                1, 0, 3, null, null, null, null, null, null, null,
                                                null, null, null, 3, 0, 3, 3, null, null, 0, 0, 1,
                                                0, null, null, null, null, null, null, null,
                                                null))),
                equalTo(true));
    }
}
