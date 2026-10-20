package g3901_4000.s3954_sum_of_compatible_numbers_in_range_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfGoodIntegers() {
        assertThat(new Solution().sumOfGoodIntegers(2, 3), equalTo(10));
    }

    @Test
    void sumOfGoodIntegers2() {
        assertThat(new Solution().sumOfGoodIntegers(5, 1), equalTo(0));
    }

    @Test
    void sumOfGoodIntegers3() {
        assertThat(new Solution().sumOfGoodIntegers(1, 1), equalTo(2));
    }
}
