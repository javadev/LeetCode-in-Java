package g3501_3600.s3543_maximum_weighted_k_edge_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxWeight() {
        assertThat(
                new Solution().maxWeight(3, new int[][] {{0, 1, 1}, {1, 2, 2}}, 2, 4), equalTo(3));
    }

    @Test
    void maxWeight2() {
        assertThat(
                new Solution().maxWeight(3, new int[][] {{0, 1, 2}, {0, 2, 3}}, 1, 3), equalTo(2));
    }

    @Test
    void maxWeight3() {
        assertThat(
                new Solution().maxWeight(3, new int[][] {{0, 1, 6}, {1, 2, 8}}, 1, 6), equalTo(-1));
    }
}
