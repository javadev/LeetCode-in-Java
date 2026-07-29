package g3801_3900.s3855_sum_of_k_digit_numbers_in_a_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfNumbers() {
        assertThat(new Solution().sumOfNumbers(1, 2, 2), equalTo(66));
    }

    @Test
    void sumOfNumbers2() {
        assertThat(new Solution().sumOfNumbers(0, 1, 3), equalTo(444));
    }

    @Test
    void sumOfNumbers3() {
        assertThat(new Solution().sumOfNumbers(5, 5, 10), equalTo(555555520));
    }
}
