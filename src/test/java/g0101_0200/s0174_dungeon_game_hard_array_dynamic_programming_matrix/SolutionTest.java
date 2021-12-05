package g0101_0200.s0174_dungeon_game_hard_array_dynamic_programming_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void dungeonGame() {
        int[][] input = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        assertThat(new Solution().calculateMinimumHP(input), equalTo(7));
    }
}
