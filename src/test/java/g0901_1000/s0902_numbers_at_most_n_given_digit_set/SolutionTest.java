package g0901_1000.s0902_numbers_at_most_n_given_digit_set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void atMostNGivenDigitSet() {
        assertThat(
                new Solution().atMostNGivenDigitSet(new String[] {"1", "3", "5", "7"}, 100),
                equalTo(20));
    }

    @Test
    void atMostNGivenDigitSet2() {
        assertThat(
                new Solution().atMostNGivenDigitSet(new String[] {"1", "4", "9"}, 1000000000),
                equalTo(29523));
    }

    @Test
    void atMostNGivenDigitSet3() {
        assertThat(new Solution().atMostNGivenDigitSet(new String[] {"7"}, 8), equalTo(1));
    }
}
