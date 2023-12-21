package g1101_1200.s1161_maximum_level_sum_of_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxLevelSum() {
        TreeNode root = TreeNode.create(Arrays.asList(1, 7, 0, 7, -8, null, null));
        assertThat(new Solution().maxLevelSum(root), equalTo(2));
    }

    @Test
    void maxLevelSum2() {
        TreeNode root =
                TreeNode.create(
                        Arrays.asList(989, null, 10250, 98693, -89388, null, null, null, -32127));
        assertThat(new Solution().maxLevelSum(root), equalTo(2));
    }
}
