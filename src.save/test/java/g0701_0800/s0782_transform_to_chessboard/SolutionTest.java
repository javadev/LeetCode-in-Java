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
}
