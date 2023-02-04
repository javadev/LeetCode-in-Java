package g1301_1400.s1302_deepest_leaves_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deepestLeavesSum() {
        TreeNode treeNode =
                TreeNode.create(
                        Arrays.asList(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8));
        assertThat(new Solution().deepestLeavesSum(treeNode), equalTo(15));
    }

    @Test
    void deepestLeavesSum2() {
        TreeNode treeNode =
                TreeNode.create(
                        Arrays.asList(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5));
        assertThat(new Solution().deepestLeavesSum(treeNode), equalTo(19));
    }
}
