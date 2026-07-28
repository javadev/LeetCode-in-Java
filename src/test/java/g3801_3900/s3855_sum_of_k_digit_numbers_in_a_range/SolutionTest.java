package g3801_3900.s3855_sum_of_k_digit_numbers_in_a_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumsAllKDigitNumbersModuloTheRequiredValue() {
        Solution solution = new Solution();

        assertThat(solution.sumOfNumbers(1, 2, 2), equalTo(66));
        assertThat(solution.sumOfNumbers(0, 1, 3), equalTo(444));
        assertThat(solution.sumOfNumbers(5, 5, 10), equalTo(555555520));
    }
}
