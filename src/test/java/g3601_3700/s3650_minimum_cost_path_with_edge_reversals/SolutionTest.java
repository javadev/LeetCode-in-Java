package g3601_3700.s3650_minimum_cost_path_with_edge_reversals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution().minCost(4, new int[][] {{0, 1, 3}, {3, 1, 1}, {2, 3, 4}, {0, 2, 2}}),
                equalTo(5));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution().minCost(4, new int[][] {{0, 2, 1}, {2, 1, 1}, {1, 3, 1}, {2, 3, 3}}),
                equalTo(3));
    }
}
