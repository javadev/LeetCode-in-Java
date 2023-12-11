package g0801_0900.s0867_transpose_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void transpose() {
        assertThat(
                new Solution().transpose(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                equalTo(new int[][] {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}));
    }

    @Test
    void transpose2() {
        assertThat(
                new Solution().transpose(new int[][] {{1, 2, 3}, {4, 5, 6}}),
                equalTo(new int[][] {{1, 4}, {2, 5}, {3, 6}}));
    }
}
