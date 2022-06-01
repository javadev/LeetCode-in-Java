package g2101_2200.s2187_minimum_time_to_complete_trips;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTime() {
        assertThat(new Solution().minimumTime(new int[] {1, 2, 3}, 5), equalTo(3L));
    }

    @Test
    void minimumTime2() {
        assertThat(new Solution().minimumTime(new int[] {2}, 1), equalTo(2L));
    }
}
