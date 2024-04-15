package g2101_2200.s2147_number_of_ways_to_divide_a_long_corridor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfWays() {
        assertThat(new Solution().numberOfWays("SSPPSPS"), equalTo(3));
    }

    @Test
    void numberOfWays2() {
        assertThat(new Solution().numberOfWays("PPSPSP"), equalTo(1));
    }

    @Test
    void numberOfWays3() {
        assertThat(new Solution().numberOfWays("S"), equalTo(0));
    }
}
