package g0201_0300.s0233_number_of_digit_one;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDigitOne() {
        assertThat(new Solution().countDigitOne(13), equalTo(6));
    }

    @Test
    void countDigitOne2() {
        assertThat(new Solution().countDigitOne(0), equalTo(0));
    }
}
