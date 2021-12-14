package g0401_0500.s0404_sum_of_left_leaves;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfLeftLeaves() {
        assertThat(
                new Solution()
                        .sumOfLeftLeaves(
                                TreeNode.create(Arrays.asList(3, 9, 20, null, null, 15, 7))),
                equalTo(24));
    }

    @Test
    void sumOfLeftLeaves2() {
        assertThat(new Solution().sumOfLeftLeaves(TreeNode.create(Arrays.asList(1))), equalTo(0));
    }
}
