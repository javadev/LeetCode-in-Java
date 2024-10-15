package g3301_3400.s3317_find_the_number_of_possible_ways_for_an_event;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfWays() {
        assertThat(new Solution().numberOfWays(1, 2, 3), equalTo(6));
    }

    @Test
    void numberOfWays2() {
        assertThat(new Solution().numberOfWays(5, 2, 1), equalTo(32));
    }

    @Test
    void numberOfWays3() {
        assertThat(new Solution().numberOfWays(3, 3, 4), equalTo(684));
    }
}
