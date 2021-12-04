package g0001_0100.s0073_set_matrix_zeroes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void setZeroes() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        new Solution().setZeroes(matrix);
        assertThat(matrix, equalTo(new int[][] {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}));
    }
}
