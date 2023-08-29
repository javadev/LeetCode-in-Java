package g1201_1300.s1277_count_square_submatrices_with_all_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSquares() {
        assertThat(
                new Solution().countSquares(new int[][] {{0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}}),
                equalTo(15));
    }

    @Test
    void countSquares2() {
        assertThat(
                new Solution().countSquares(new int[][] {{1, 0, 1}, {1, 1, 0}, {1, 1, 0}}),
                equalTo(7));
    }
}
