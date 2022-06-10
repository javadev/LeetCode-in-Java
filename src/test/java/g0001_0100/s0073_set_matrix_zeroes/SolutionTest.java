package g0001_0100.s0073_set_matrix_zeroes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void setZeroes() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        new Solution().setZeroes(matrix);
        assertThat(matrix, equalTo(new int[][] {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}));
    }

    @Test
    void setZeroes2() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        new Solution().setZeroes(matrix);
        assertThat(matrix, equalTo(new int[][] {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}}));
    }
}
