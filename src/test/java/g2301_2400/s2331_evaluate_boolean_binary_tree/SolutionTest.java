package g2301_2400.s2331_evaluate_boolean_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
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
        assertThat(new Solution().evaluateTree(TreeNode.create(Arrays.asList(0))), equalTo(false));
    }
}
