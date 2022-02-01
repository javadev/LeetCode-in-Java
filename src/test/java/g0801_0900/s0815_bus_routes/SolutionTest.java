package g0801_0900.s0815_bus_routes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numBusesToDestination() {
        assertThat(
                new Solution().numBusesToDestination(new int[][] {{1, 2, 7}, {3, 6, 7}}, 1, 6),
                equalTo(2));
    }

    @Test
    void numBusesToDestination2() {
        assertThat(
                new Solution()
                        .numBusesToDestination(
                                new int[][] {{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}},
                                15,
                                12),
                equalTo(-1));
    }
}
