package g1201_1300.s1269_number_of_ways_to_stay_in_the_same_place_after_some_steps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numWays() {
        assertThat(new Solution().numWays(3, 2), equalTo(4));
    }

    @Test
    void numWays2() {
        assertThat(new Solution().numWays(3, 2), equalTo(4));
    }

    @Test
    void numWays3() {
        assertThat(new Solution().numWays(4, 2), equalTo(8));
    }
}
