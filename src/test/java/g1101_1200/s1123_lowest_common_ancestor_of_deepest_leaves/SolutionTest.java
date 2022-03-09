package g1101_1200.s1123_lowest_common_ancestor_of_deepest_leaves;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lcaDeepestLeaves() {
        assertThat(
                new Solution()
                        .lcaDeepestLeaves(
                                TreeNode.create(
                                        Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)))
                        .toString(),
                equalTo("2,7,4"));
    }

    @Test
    void lcaDeepestLeaves2() {
        assertThat(
                new Solution().lcaDeepestLeaves(TreeNode.create(Arrays.asList(1))).toString(),
                equalTo("1"));
    }

    @Test
    void lcaDeepestLeaves3() {
        assertThat(
                new Solution()
                        .lcaDeepestLeaves(TreeNode.create(Arrays.asList(0, 1, 3, null, 2)))
                        .toString(),
                equalTo("2"));
    }
}
