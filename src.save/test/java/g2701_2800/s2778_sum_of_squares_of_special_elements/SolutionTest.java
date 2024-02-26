package g2701_2800.s2778_sum_of_squares_of_special_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfSquares() {
        assertThat(new Solution().sumOfSquares(new int[] {1, 2, 3, 4}), equalTo(21));
    }

    @Test
    void sumOfSquares2() {
        assertThat(new Solution().sumOfSquares(new int[] {2, 7, 1, 19, 18, 3}), equalTo(63));
    }
}
