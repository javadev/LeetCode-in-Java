package g3401_3500.s3453_separate_squares_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void separateSquares() {
        assertThat(
                new Solution().separateSquares(new int[][] {{0, 0, 1}, {2, 2, 1}}), equalTo(1.0));
    }

    @Test
    void separateSquares2() {
        assertThat(
                new Solution().separateSquares(new int[][] {{0, 0, 2}, {1, 1, 1}}),
                equalTo(1.1666666666666667));
    }
}
