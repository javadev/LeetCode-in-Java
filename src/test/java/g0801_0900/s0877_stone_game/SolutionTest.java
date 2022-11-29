package g0801_0900.s0877_stone_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void stoneGame() {
        assertThat(new Solution().stoneGame(new int[] {5, 3, 4, 5}), equalTo(true));
    }

    @Test
    void stoneGame2() {
        assertThat(new Solution().stoneGame(new int[] {3, 7, 2, 3}), equalTo(true));
    }
}
