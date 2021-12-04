package g0201_0300.s0289_game_of_life;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void gameOfLife() {
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        new Solution().gameOfLife(board);
        assertThat(board, equalTo(new int[][] {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}}));
    }

    @Test
    void gameOfLife2() {
        int[][] board = {{1, 1}, {1, 0}};
        new Solution().gameOfLife(board);
        assertThat(board, equalTo(new int[][] {{1, 1}, {1, 1}}));
    }
}
