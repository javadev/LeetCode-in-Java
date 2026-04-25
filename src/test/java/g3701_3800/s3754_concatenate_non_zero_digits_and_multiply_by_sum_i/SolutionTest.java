package g3701_3800.s3754_concatenate_non_zero_digits_and_multiply_by_sum_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumAndMultiply() {
        assertThat(new Solution().sumAndMultiply(10203004), equalTo(12340L));
    }

    @Test
    void sumAndMultiply2() {
        assertThat(new Solution().sumAndMultiply(1000), equalTo(1L));
    }
}
