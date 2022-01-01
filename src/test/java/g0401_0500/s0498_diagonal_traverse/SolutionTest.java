package g0401_0500.s0498_diagonal_traverse;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDiagonalOrder() {
        assertThat(
                new Solution().findDiagonalOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                equalTo(new int[] {1, 2, 4, 7, 5, 3, 6, 8, 9}));
    }

    @Test
    void findDiagonalOrder2() {
        assertThat(
                new Solution().findDiagonalOrder(new int[][] {{1, 2}, {3, 4}}),
                equalTo(new int[] {1, 2, 3, 4}));
    }
}
