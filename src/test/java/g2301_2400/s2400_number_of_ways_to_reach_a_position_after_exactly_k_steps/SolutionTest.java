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
}
