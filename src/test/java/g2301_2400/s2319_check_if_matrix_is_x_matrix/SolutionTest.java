package g2301_2400.s2319_check_if_matrix_is_x_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkXMatrix() {
        assertThat(
                new Solution()
                        .checkXMatrix(
                                new int[][] {
                                    {2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}
                                }),
                equalTo(true));
    }

    @Test
    void checkXMatrix2() {
        assertThat(
                new Solution().checkXMatrix(new int[][] {{5, 7, 0}, {0, 3, 1}, {0, 5, 0}}),
                equalTo(false));
    }

    @Test
    void checkXMatrix3() {
        assertThat(
                new Solution()
                        .checkXMatrix(
                                new int[][] {
                                    {0, 0, 0, 0, 1},
                                    {0, 4, 0, 1, 0},
                                    {0, 0, 5, 0, 0},
                                    {0, 5, 0, 2, 0},
                                    {4, 0, 0, 0, 2}
                                }),
                equalTo(false));
    }
}
