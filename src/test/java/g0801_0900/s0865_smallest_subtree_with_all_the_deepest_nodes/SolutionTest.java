package g0801_0900.s0865_smallest_subtree_with_all_the_deepest_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subtreeWithAllDeepest() {
        assertThat(
                new Solution()
                        .subtreeWithAllDeepest(
                                TreeUtils.constructBinaryTree(
                                        Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)))
                        .toString(),
                equalTo("2,7,4"));
    }

    @Test
    void subtreeWithAllDeepest2() {
        assertThat(
                new Solution()
                        .subtreeWithAllDeepest(TreeUtils.constructBinaryTree(Arrays.asList(1)))
                        .toString(),
                equalTo("1"));
    }

    @Test
    void subtreeWithAllDeepest3() {
        assertThat(
                new Solution()
                        .subtreeWithAllDeepest(
                                TreeUtils.constructBinaryTree(Arrays.asList(0, 1, 3, null, 2)))
                        .toString(),
                equalTo("2"));
    }
}
