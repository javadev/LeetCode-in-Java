package g0801_0900.s0840_magic_squares_in_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numMagicSquaresInside() {
        assertThat(
                new Solution()
                        .numMagicSquaresInside(
                                new int[][] {{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}}),
                equalTo(1));
    }

    @Test
    void numMagicSquaresInside2() {
        assertThat(new Solution().numMagicSquaresInside(new int[][] {{8}}), equalTo(0));
    }
}
