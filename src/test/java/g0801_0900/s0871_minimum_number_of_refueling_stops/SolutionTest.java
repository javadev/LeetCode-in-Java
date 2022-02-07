package g0801_0900.s0871_minimum_number_of_refueling_stops;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minRefuelStops() {
        assertThat(new Solution().minRefuelStops(1, 1, new int[][] {}), equalTo(0));
    }

    @Test
    void minRefuelStops2() {
        assertThat(new Solution().minRefuelStops(100, 1, new int[][] {{10, 100}}), equalTo(-1));
    }

    @Test
    void minRefuelStops3() {
        assertThat(
                new Solution()
                        .minRefuelStops(
                                100, 10, new int[][] {{10, 60}, {20, 30}, {30, 30}, {60, 40}}),
                equalTo(2));
    }
}
