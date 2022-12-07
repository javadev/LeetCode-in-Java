package g0501_0600.s0566_reshape_the_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void matrixReshape() {
        int[][] mat = {{1, 2}, {3, 4}};
        assertThat(new Solution().matrixReshape(mat, 1, 4), equalTo(new int[][] {{1, 2, 3, 4}}));
    }

    @Test
    void matrixReshape2() {
        int[][] mat = {{1, 2}, {3, 4}};
        assertThat(new Solution().matrixReshape(mat, 2, 4), equalTo(mat));
    }
}
