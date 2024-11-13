package g3301_3400.s3348_smallest_divisible_digit_product_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestNumber() {
        assertThat(new Solution().smallestNumber("1234", 256L), equalTo("1488"));
    }

    @Test
    void smallestNumber2() {
        assertThat(new Solution().smallestNumber("12355", 50L), equalTo("12355"));
    }

    @Test
    void smallestNumber3() {
        assertThat(new Solution().smallestNumber("11111", 26L), equalTo("-1"));
    }

    @Test
    void smallestNumber4() {
        assertThat(new Solution().smallestNumber("10", 320L), equalTo("588"));
    }

    @Test
    void smallestNumber5() {
        assertThat(new Solution().smallestNumber("19", 2L), equalTo("21"));
    }
}
