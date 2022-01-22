package g0601_0700.s0633_sum_of_square_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void judgeSquareSum() {
        assertThat(new Solution().judgeSquareSum(5), equalTo(true));
    }

    @Test
    void judgeSquareSum2() {
        assertThat(new Solution().judgeSquareSum(3), equalTo(false));
    }
}
