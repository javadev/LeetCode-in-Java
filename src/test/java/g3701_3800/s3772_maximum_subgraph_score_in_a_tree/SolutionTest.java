package g3701_3800.s3772_maximum_subgraph_score_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubgraphScore() {
        assertThat(
                new Solution()
                        .maxSubgraphScore(3, new int[][] {{0, 1}, {1, 2}}, new int[] {1, 0, 1}),
                equalTo(new int[] {1, 1, 1}));
    }

    @Test
    void maxSubgraphScore2() {
        assertThat(
                new Solution()
                        .maxSubgraphScore(
                                5,
                                new int[][] {{1, 0}, {1, 2}, {1, 3}, {3, 4}},
                                new int[] {0, 1, 0, 1, 1}),
                equalTo(new int[] {2, 3, 2, 3, 3}));
    }

    @Test
    void maxSubgraphScore3() {
        assertThat(
                new Solution().maxSubgraphScore(2, new int[][] {{0, 1}}, new int[] {0, 0}),
                equalTo(new int[] {-1, -1}));
    }
}
