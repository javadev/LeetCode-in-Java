package g0701_0800.s0766_toeplitz_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isToeplitzMatrix() {
        assertThat(
                new Solution()
                        .isToeplitzMatrix(
                                new int[][] {
                                    {1, 2, 3, 4},
                                    {5, 1, 2, 3},
                                    {9, 5, 1, 2}
                                }),
                equalTo(true));
    }

    @Test
    void isToeplitzMatrix2() {
        assertThat(
                new Solution()
                        .isToeplitzMatrix(
                                new int[][] {
                                    {1, 2},
                                    {2, 2},
                                }),
                equalTo(false));
    }

    @Test
    void isToeplitzMatrix3() {
        assertThat(
                new Solution()
                        .isToeplitzMatrix(
                                new int[][] {
                                    {1, 2, 3, 4, 5, 9},
                                    {5, 1, 2, 3, 4, 5},
                                    {9, 5, 1, 2, 3, 4}
                                }),
                equalTo(true));
    }
}
