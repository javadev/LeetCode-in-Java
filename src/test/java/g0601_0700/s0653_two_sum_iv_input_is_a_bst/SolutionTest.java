package g0601_0700.s0653_two_sum_iv_input_is_a_bst;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTarget() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(5, 3, 6, 2, 4, null, 7));
        assertThat(new Solution().findTarget(treeNode, 9), equalTo(true));
    }

    @Test
    void findTarget2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(5, 3, 6, 2, 4, null, 7));
        assertThat(new Solution().findTarget(treeNode, 28), equalTo(false));
    }
}
