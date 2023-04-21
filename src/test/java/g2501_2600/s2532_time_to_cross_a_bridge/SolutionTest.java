package g2501_2600.s2532_time_to_cross_a_bridge;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findCrossingTime() {
        assertThat(
                new Solution()
                        .findCrossingTime(
                                1, 3, new int[][] {{1, 1, 2, 1}, {1, 1, 3, 1}, {1, 1, 4, 1}}),
                equalTo(6));
    }

    @Test
    void findCrossingTime2() {
        assertThat(
                new Solution().findCrossingTime(3, 2, new int[][] {{1, 9, 1, 8}, {10, 10, 10, 10}}),
                equalTo(50));
    }
}
