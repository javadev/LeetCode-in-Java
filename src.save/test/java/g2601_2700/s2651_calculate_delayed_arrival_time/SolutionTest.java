package g2601_2700.s2651_calculate_delayed_arrival_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDelayedArrivalTime() {
        assertThat(new Solution().findDelayedArrivalTime(15, 5), equalTo(20));
    }

    @Test
    void findDelayedArrivalTime2() {
        assertThat(new Solution().findDelayedArrivalTime(13, 11), equalTo(0));
    }
}
