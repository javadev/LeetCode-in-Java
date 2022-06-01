package g0101_0200.s0174_dungeon_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void dungeonGame() {
        int[][] input = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        assertThat(new Solution().calculateMinimumHP(input), equalTo(7));
    }

    @Test
    void dungeonGame2() {
        int[][] input = {{0}};
        assertThat(new Solution().calculateMinimumHP(input), equalTo(1));
    }
}
