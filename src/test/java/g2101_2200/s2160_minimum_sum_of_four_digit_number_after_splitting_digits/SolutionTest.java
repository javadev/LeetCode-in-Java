package g2101_2200.s2160_minimum_sum_of_four_digit_number_after_splitting_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSum() {
        assertThat(new Solution().minimumSum(2932), equalTo(52));
    }

    @Test
    void minimumSum2() {
        assertThat(new Solution().minimumSum(4009), equalTo(13));
    }
}
