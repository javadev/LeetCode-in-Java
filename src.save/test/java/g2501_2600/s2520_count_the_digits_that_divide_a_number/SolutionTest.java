package g2501_2600.s2520_count_the_digits_that_divide_a_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDigits() {
        assertThat(new Solution().countDigits(7), equalTo(1));
    }

    @Test
    void countDigits2() {
        assertThat(new Solution().countDigits(121), equalTo(2));
    }

    @Test
    void countDigits3() {
        assertThat(new Solution().countDigits(1248), equalTo(4));
    }
}
