package g3401_3500.s3446_sort_matrix_by_diagonals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortMatrix() {
        assertThat(
                new Solution().sortMatrix(new int[][] {{1, 7, 3}, {9, 8, 2}, {4, 5, 6}}),
                equalTo(new int[][] {{8, 2, 3}, {9, 6, 7}, {4, 5, 1}}));
    }

    @Test
    void sortMatrix2() {
        assertThat(
                new Solution().sortMatrix(new int[][] {{0, 1}, {1, 2}}),
                equalTo(new int[][] {{2, 1}, {1, 0}}));
    }

    @Test
    void sortMatrix3() {
        assertThat(new Solution().sortMatrix(new int[][] {{1}}), equalTo(new int[][] {{1}}));
    }
}
