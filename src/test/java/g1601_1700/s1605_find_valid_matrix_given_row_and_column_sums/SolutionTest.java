package g1601_1700.s1605_find_valid_matrix_given_row_and_column_sums;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void restoreMatrix() {
        assertThat(
                new Solution().restoreMatrix(new int[] {3, 8}, new int[] {4, 7}),
                equalTo(new int[][] {{3, 0}, {1, 7}}));
    }

    @Test
    void restoreMatrix2() {
        assertThat(
                new Solution().restoreMatrix(new int[] {5, 7, 10}, new int[] {8, 6, 8}),
                equalTo(new int[][] {{5, 0, 0}, {3, 4, 0}, {0, 2, 8}}));
    }
}
