package g3501_3600.s3558_number_of_ways_to_assign_edge_weights_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void assignEdgeWeights() {
        assertThat(new Solution().assignEdgeWeights(new int[][] {{1, 2}}), equalTo(1));
    }

    @Test
    void assignEdgeWeights2() {
        assertThat(
                new Solution().assignEdgeWeights(new int[][] {{1, 2}, {1, 3}, {3, 4}, {3, 5}}),
                equalTo(2));
    }
}
