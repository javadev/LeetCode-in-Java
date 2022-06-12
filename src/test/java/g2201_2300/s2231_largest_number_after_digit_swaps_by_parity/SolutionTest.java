package g2201_2300.s2231_largest_number_after_digit_swaps_by_parity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestInteger() {
        assertThat(new Solution().largestInteger(1234), equalTo(3412));
    }

    @Test
    void largestInteger2() {
        assertThat(new Solution().largestInteger(65875), equalTo(87655));
    }
}
