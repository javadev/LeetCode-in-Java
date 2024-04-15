package g0601_0700.s0637_average_of_levels_in_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void averageOfLevels() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(3, 9, 20, null, null, 15, 7));
        assertThat(
                new Solution().averageOfLevels(treeNode),
                equalTo(Arrays.asList(3.00000, 14.50000, 11.00000)));
    }

    @Test
    void averageOfLevels2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(3, 9, 20, 15, 7));
        assertThat(
                new Solution().averageOfLevels(treeNode),
                equalTo(Arrays.asList(3.00000, 14.50000, 11.00000)));
    }
}
