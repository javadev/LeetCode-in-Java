package g0801_0900.s0885_spiral_matrix_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void spiralMatrixIII() {
        assertThat(
                new Solution().spiralMatrixIII(1, 4, 0, 0),
                equalTo(new int[][] {{0, 0}, {0, 1}, {0, 2}, {0, 3}}));
    }

    @Test
    void spiralMatrixIII2() {
        assertThat(
                new Solution().spiralMatrixIII(5, 6, 1, 4),
                equalTo(
                        new int[][] {
                            {1, 4}, {1, 5}, {2, 5}, {2, 4}, {2, 3}, {1, 3}, {0, 3}, {0, 4}, {0, 5},
                            {3, 5}, {3, 4}, {3, 3}, {3, 2}, {2, 2}, {1, 2}, {0, 2}, {4, 5}, {4, 4},
                            {4, 3}, {4, 2}, {4, 1}, {3, 1}, {2, 1}, {1, 1}, {0, 1}, {4, 0}, {3, 0},
                            {2, 0}, {1, 0}, {0, 0}
                        }));
    }
}
