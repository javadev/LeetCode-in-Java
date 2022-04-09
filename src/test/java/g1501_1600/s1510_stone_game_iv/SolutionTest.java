package g1501_1600.s1510_stone_game_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void winnerSquareGame() {
        assertThat(new Solution().winnerSquareGame(1), equalTo(true));
    }

    @Test
    void winnerSquareGame2() {
        assertThat(new Solution().winnerSquareGame(2), equalTo(false));
    }

    @Test
    void winnerSquareGame3() {
        assertThat(new Solution().winnerSquareGame(4), equalTo(true));
    }
}
