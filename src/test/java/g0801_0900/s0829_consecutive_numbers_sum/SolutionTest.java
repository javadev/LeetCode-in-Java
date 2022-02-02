package g0801_0900.s0829_consecutive_numbers_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void consecutiveNumbersSum() {
        assertThat(new Solution().consecutiveNumbersSum(5), equalTo(2));
    }

    @Test
    void consecutiveNumbersSum2() {
        assertThat(new Solution().consecutiveNumbersSum(9), equalTo(3));
    }

    @Test
    void consecutiveNumbersSum3() {
        assertThat(new Solution().consecutiveNumbersSum(15), equalTo(4));
    }
}
