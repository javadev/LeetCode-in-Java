package g0701_0800.s0783_minimum_distance_between_bst_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDiffInBST() {
        assertThat(
                new Solution()
                        .minDiffInBST(
                                TreeUtils.constructBinaryTree(
                                        Arrays.asList(4, 2, 6, 1, 3, null, null))),
                equalTo(1));
    }

    @Test
    void minDiffInBST2() {
        assertThat(
                new Solution()
                        .minDiffInBST(
                                TreeUtils.constructBinaryTree(
                                        Arrays.asList(1, 0, 48, null, null, 12, 49))),
                equalTo(1));
    }
}
