package g0501_0600.s0542_01_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void updateMatrix() {
        assertThat(
                new Solution().updateMatrix((new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}})),
                equalTo(new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

    @Test
    void updateMatrix2() {
        assertThat(
                new Solution().updateMatrix((new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}})),
                equalTo(new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 2, 1}}));
    }
}
