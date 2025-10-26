package g3701_3800.s3723_maximize_sum_of_squares_of_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumOfSquares() {
        assertThat(new Solution().maxSumOfSquares(2, 3), equalTo("30"));
    }

    @Test
    void maxSumOfSquares2() {
        assertThat(new Solution().maxSumOfSquares(2, 17), equalTo("98"));
    }

    @Test
    void maxSumOfSquares3() {
        assertThat(new Solution().maxSumOfSquares(1, 10), equalTo(""));
    }
}
