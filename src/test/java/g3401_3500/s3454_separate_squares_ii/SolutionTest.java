package g3401_3500.s3454_separate_squares_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void separateSquares() {
        assertThat(
                new Solution().separateSquares(new int[][] {{0, 0, 1}, {2, 2, 1}}), equalTo(1.0D));
    }

    @Test
    void separateSquares2() {
        assertThat(
                new Solution().separateSquares(new int[][] {{0, 0, 2}, {1, 1, 1}}), equalTo(1.0D));
    }
}
