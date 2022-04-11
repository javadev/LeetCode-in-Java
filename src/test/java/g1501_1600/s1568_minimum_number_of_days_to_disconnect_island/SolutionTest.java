package g1501_1600.s1568_minimum_number_of_days_to_disconnect_island;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDays() {
        assertThat(
                new Solution().minDays(new int[][] {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}),
                equalTo(2));
    }

    @Test
    void minDays2() {
        assertThat(new Solution().minDays(new int[][] {{1, 1}}), equalTo(2));
    }
}
