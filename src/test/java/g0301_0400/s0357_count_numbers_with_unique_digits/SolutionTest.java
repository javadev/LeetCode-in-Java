package g0301_0400.s0357_count_numbers_with_unique_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countNumbersWithUniqueDigits() {
        assertThat(new Solution().countNumbersWithUniqueDigits(2), equalTo(91));
    }

    @Test
    void countNumbersWithUniqueDigits2() {
        assertThat(new Solution().countNumbersWithUniqueDigits(0), equalTo(1));
    }
}
