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

    @Test
    void numMagicSquaresInside3() {
        assertThat(new Solution().numMagicSquaresInside(new int[][] {{1, 2}, {3, 4}}), equalTo(0));
    }

    @Test
    void numMagicSquaresInside4() {
        assertThat(
                new Solution()
                        .numMagicSquaresInside(
                                new int[][] {
                                    {4, 3, 8, 4, 3},
                                    {9, 5, 1, 9, 5},
                                    {2, 7, 6, 2, 7},
                                    {4, 3, 8, 4, 3},
                                    {9, 5, 1, 9, 5}
                                }),
                equalTo(1));
    }

    @Test
    void numMagicSquaresInside5() {
        assertThat(
                new Solution()
                        .numMagicSquaresInside(
                                new int[][] {
                                    {10, 3, 8},
                                    {9, 5, 1},
                                    {2, 7, 6}
                                }),
                equalTo(0));
    }

    @Test
    void numMagicSquaresInside6() {
        assertThat(
                new Solution()
                        .numMagicSquaresInside(
                                new int[][] {
                                    {4, 3, 8, 4},
                                    {9, 5, 1, 9},
                                    {2, 7, 6, 2},
                                    {4, 3, 8, 4}
                                }),
                equalTo(1));
    }

    @Test
    void numMagicSquaresInside7() {
        assertThat(
                new Solution()
                        .numMagicSquaresInside(
                                new int[][] {
                                    {2, 2, 2},
                                    {2, 2, 2},
                                    {2, 2, 2}
                                }),
                equalTo(0));
    }
}
