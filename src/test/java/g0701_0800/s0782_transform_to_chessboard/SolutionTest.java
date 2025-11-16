package g0701_0800.s0782_transform_to_chessboard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void movesToChessboard() {
        assertThat(
                new Solution()
                        .movesToChessboard(
                                new int[][] {
                                    {0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}, {1, 0, 0, 1}
                                }),
                equalTo(2));
    }

    @Test
    void movesToChessboard2() {
        assertThat(new Solution().movesToChessboard(new int[][] {{0, 1}, {1, 0}}), equalTo(0));
    }

    @Test
    void movesToChessboard3() {
        assertThat(new Solution().movesToChessboard(new int[][] {{1, 0}, {1, 0}}), equalTo(-1));
    }

    @Test
    void movesToChessboard4() {
        assertThat(
                new Solution()
                        .movesToChessboard(
                                new int[][] {
                                    {0, 0},
                                    {0, 1}
                                }),
                equalTo(-1));
    }

    @Test
    void movesToChessboard5() {
        assertThat(
                new Solution()
                        .movesToChessboard(
                                new int[][] {
                                    {1, 1},
                                    {1, 1}
                                }),
                equalTo(-1));
    }

    @Test
    void movesToChessboard6() {
        assertThat(
                new Solution()
                        .movesToChessboard(
                                new int[][] {
                                    {1, 0},
                                    {1, 0}
                                }),
                equalTo(-1));
    }

    @Test
    void movesToChessboard7() {
        assertThat(
                new Solution()
                        .movesToChessboard(
                                new int[][] {
                                    {1, 0, 1},
                                    {0, 1, 0},
                                    {1, 0, 1}
                                }),
                equalTo(0));
    }

    @Test
    void movesToChessboard8() {
        assertThat(
                new Solution()
                        .movesToChessboard(
                                new int[][] {
                                    {1, 0, 0, 1},
                                    {0, 1, 1, 0},
                                    {1, 0, 0, 1},
                                    {0, 1, 1, 0}
                                }),
                equalTo(1));
    }

    @Test
    void movesToChessboard9() {
        assertThat(new Solution().movesToChessboard(new int[][] {{0}}), equalTo(0));
    }
}
