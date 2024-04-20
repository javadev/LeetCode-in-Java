package g2701_2800.s2787_ways_to_express_an_integer_as_sum_of_powers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfWays() {
        assertThat(new Solution().numberOfWays(10, 2), equalTo(1));
    }

    @Test
    void numberOfWays2() {
        assertThat(new Solution().numberOfWays(4, 1), equalTo(2));
    }
}
