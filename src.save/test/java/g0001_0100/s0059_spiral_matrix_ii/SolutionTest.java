package g0001_0100.s0059_spiral_matrix_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void generateMatrix() {
        assertThat(
                new Solution().generateMatrix(3),
                equalTo(new int[][] {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}}));
    }

    @Test
    void generateMatrix2() {
        assertThat(new Solution().generateMatrix(1), equalTo(new int[][] {{1}}));
    }
}
