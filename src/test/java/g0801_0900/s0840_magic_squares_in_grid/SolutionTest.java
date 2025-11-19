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

    @Test
    void numMagicSquaresInside8() {
        int[][] grid = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(1));
    }

    @Test
    void numMagicSquaresInside9() {
        int[][] grid = {
            {8, 1, 6, 8, 1, 6},
            {3, 5, 7, 3, 5, 7},
            {4, 9, 2, 4, 9, 2}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(2));
    }

    @Test
    void numMagicSquaresInside10() {
        int[][] grid = {
            {8, 1, 6, 1},
            {3, 5, 7, 5},
            {4, 9, 2, 9},
            {8, 1, 6, 1}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(1));
    }

    @Test
    void numMagicSquaresInside11() {
        int[][] grid = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 8}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(0));
    }

    @Test
    void numMagicSquaresInside12() {
        int[][] grid = {
            {8, 1, 6},
            {3, 5, 20},
            {4, 9, 2}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(0));
    }

    @Test
    void numMagicSquaresInside13() {
        int[][] grid = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 2, 9}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(0));
    }

    @Test
    void numMagicSquaresInside14() {
        int[][] grid = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 3}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(0));
    }

    @Test
    void numMagicSquaresInside15() {
        int[][] grid = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(0));
    }

    @Test
    void numMagicSquaresInside16() {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(0));
    }

    @Test
    void numMagicSquaresInside17() {
        int[][] grid = {
            {1, 2, 3, 8},
            {4, 5, 6, 1},
            {7, 8, 9, 6},
            {3, 5, 7, 7}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(0));
    }

    @Test
    void numMagicSquaresInside18() {
        int[][] grid = {
            {8, 1, 6, 8},
            {3, 5, 7, 3},
            {4, 9, 2, 4},
            {8, 1, 6, 99}
        };
        assertThat(new Solution().numMagicSquaresInside(grid), equalTo(1));
    }
}
