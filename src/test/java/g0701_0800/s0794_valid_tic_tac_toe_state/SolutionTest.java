package g0701_0800.s0794_valid_tic_tac_toe_state;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validTicTacToe() {
        assertThat(
                new Solution().validTicTacToe(new String[] {"O  ", "   ", "   "}), equalTo(false));
    }

    @Test
    void validTicTacToe2() {
        assertThat(
                new Solution().validTicTacToe(new String[] {"XOX", " X ", "   "}), equalTo(false));
    }

    @Test
    void validTicTacToe3() {
        assertThat(
                new Solution().validTicTacToe(new String[] {"XOX", "O O", "XOX"}), equalTo(true));
    }
}
