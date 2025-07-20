package g3601_3700.s3622_check_divisibility_by_digit_sum_and_product;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkDivisibility() {
        assertThat(new Solution().checkDivisibility(99), equalTo(true));
    }

    @Test
    void checkDivisibility2() {
        assertThat(new Solution().checkDivisibility(23), equalTo(false));
    }
}
