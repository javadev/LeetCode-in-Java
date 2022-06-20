package g2301_2400.s2310_sum_of_numbers_with_units_digit_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumNumbers() {
        assertThat(new Solution().minimumNumbers(58, 9), equalTo(2));
    }

    @Test
    void minimumNumbers2() {
        assertThat(new Solution().minimumNumbers(37, 2), equalTo(-1));
    }

    @Test
    void minimumNumbers3() {
        assertThat(new Solution().minimumNumbers(0, 7), equalTo(0));
    }

    @Test
    void minimumNumbers4() {
        assertThat(new Solution().minimumNumbers(2, 8), equalTo(-1));
    }
}
