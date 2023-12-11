package g1501_1600.s1572_matrix_diagonal_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void diagonalSum() {
        assertThat(
                new Solution().diagonalSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                equalTo(25));
    }

    @Test
    void diagonalSum2() {
        assertThat(
                new Solution()
                        .diagonalSum(
                                new int[][] {
                                    {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}
                                }),
                equalTo(8));
    }

    @Test
    void diagonalSum3() {
        assertThat(new Solution().diagonalSum(new int[][] {{5}}), equalTo(5));
    }
}
