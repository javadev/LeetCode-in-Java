package g3301_3400.s3345_smallest_divisible_digit_product_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestNumber() {
        assertThat(new Solution().smallestNumber(10, 2), equalTo(10));
    }

    @Test
    void smallestNumber2() {
        assertThat(new Solution().smallestNumber(15, 3), equalTo(16));
    }
}
