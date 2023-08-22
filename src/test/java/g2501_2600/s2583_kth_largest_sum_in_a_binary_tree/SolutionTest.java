package g2501_2600.s2583_kth_largest_sum_in_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthLargestLevelSum() {
        assertThat(
                new Solution()
                        .kthLargestLevelSum(
                                TreeNode.create(Arrays.asList(5, 8, 9, 2, 1, 3, 7, 4, 6)), 2),
                equalTo(13L));
    }

    @Test
    void kthLargestLevelSum2() {
        assertThat(
                new Solution().kthLargestLevelSum(TreeNode.create(Arrays.asList(1, 2, null, 3)), 1),
                equalTo(3L));
    }
}
