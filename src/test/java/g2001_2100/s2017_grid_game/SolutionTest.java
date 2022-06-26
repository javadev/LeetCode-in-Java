package g2001_2100.s2017_grid_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void gridGame() {
        assertThat(new Solution().gridGame(new int[][] {{2, 5, 4}, {1, 5, 1}}), equalTo(4L));
    }

    @Test
    void gridGame2() {
        assertThat(new Solution().gridGame(new int[][] {{3, 3, 1}, {8, 5, 2}}), equalTo(4L));
    }

    @Test
    void gridGame3() {
        assertThat(new Solution().gridGame(new int[][] {{1, 3, 1, 15}, {1, 3, 3, 1}}), equalTo(7L));
    }
}
