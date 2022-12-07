package g1301_1400.s1314_matrix_block_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void matrixBlockSum() {
        assertThat(
                new Solution().matrixBlockSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1),
                equalTo(new int[][] {{12, 21, 16}, {27, 45, 33}, {24, 39, 28}}));
    }

    @Test
    void matrixBlockSum2() {
        assertThat(
                new Solution().matrixBlockSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 2),
                equalTo(new int[][] {{45, 45, 45}, {45, 45, 45}, {45, 45, 45}}));
    }
}
