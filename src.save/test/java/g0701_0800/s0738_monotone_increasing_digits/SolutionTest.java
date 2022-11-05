package g0701_0800.s0738_monotone_increasing_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void monotoneIncreasingDigits() {
        assertThat(new Solution().monotoneIncreasingDigits(10), equalTo(9));
    }

    @Test
    void monotoneIncreasingDigits2() {
        assertThat(new Solution().monotoneIncreasingDigits(1234), equalTo(1234));
    }

    @Test
    void monotoneIncreasingDigits3() {
        assertThat(new Solution().monotoneIncreasingDigits(332), equalTo(299));
    }
}
