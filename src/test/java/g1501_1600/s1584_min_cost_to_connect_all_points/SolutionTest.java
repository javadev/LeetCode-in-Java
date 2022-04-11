package g1501_1600.s1584_min_cost_to_connect_all_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCostConnectPoints() {
        assertThat(
                new Solution()
                        .minCostConnectPoints(
                                new int[][] {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}),
                equalTo(20));
    }

    @Test
    void minCostConnectPoints2() {
        assertThat(
                new Solution().minCostConnectPoints(new int[][] {{3, 12}, {-2, 5}, {-4, 1}}),
                equalTo(18));
    }
}
