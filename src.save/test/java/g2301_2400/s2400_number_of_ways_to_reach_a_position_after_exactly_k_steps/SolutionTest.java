package g2301_2400.s2400_number_of_ways_to_reach_a_position_after_exactly_k_steps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfWays() {
        assertThat(new Solution().numberOfWays(1, 2, 3), equalTo(3));
    }

    @Test
    void numberOfWays2() {
        assertThat(new Solution().numberOfWays(2, 5, 10), equalTo(0));
    }

    @Test
    void numberOfWays3() {
        assertThat(new Solution().numberOfWays(1, 10, 3), equalTo(0));
    }

    @Test
    void numberOfWays4() {
        assertThat(new Solution().numberOfWays(1, 1000, 999), equalTo(1));
    }

    @Test
    void numberOfWays5() {
        assertThat(new Solution().numberOfWays(272, 270, 6), equalTo(15));
    }
}
