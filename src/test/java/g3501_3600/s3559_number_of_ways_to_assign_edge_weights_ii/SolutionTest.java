package g3501_3600.s3559_number_of_ways_to_assign_edge_weights_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void assignEdgeWeights() {
        assertThat(
                new Solution()
                        .assignEdgeWeights(new int[][] {{1, 2}}, new int[][] {{1, 1}, {1, 2}}),
                equalTo(new int[] {0, 1}));
    }

    @Test
    void assignEdgeWeights2() {
        assertThat(
                new Solution()
                        .assignEdgeWeights(
                                new int[][] {{1, 2}, {1, 3}, {3, 4}, {3, 5}},
                                new int[][] {{1, 4}, {3, 4}, {2, 5}}),
                equalTo(new int[] {2, 1, 4}));
    }
}
