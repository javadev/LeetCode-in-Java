package g0801_0900.s0810_chalkboard_xor_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void xorGame() {
        assertThat(new Solution().xorGame(new int[] {1, 1, 2}), equalTo(false));
    }

    @Test
    void xorGame2() {
        assertThat(new Solution().xorGame(new int[] {0, 1}), equalTo(true));
    }

    @Test
    void xorGame3() {
        assertThat(new Solution().xorGame(new int[] {1, 2, 3}), equalTo(true));
    }
}
