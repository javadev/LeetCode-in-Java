package g2801_2900.s2858_minimum_edge_reversals_so_every_node_is_reachable;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minEdgeReversals() {
        assertThat(
                new Solution()
                        .minEdgeReversals(
                                4,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,0],[2,1],[1,3]")),
                equalTo(new int[] {1, 1, 0, 2}));
    }

    @Test
    void minEdgeReversals2() {
        assertThat(
                new Solution()
                        .minEdgeReversals(
                                3,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2],[2,0]")),
                equalTo(new int[] {2, 0, 1}));
    }
}
