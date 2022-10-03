package g1201_1300.s1275_find_winner_on_a_tic_tac_toe_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void tictactoe() {
        assertThat(
                new Solution().tictactoe(new int[][] {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}),
                equalTo("A"));
    }

    @Test
    void tictactoe2() {
        assertThat(
                new Solution()
                        .tictactoe(new int[][] {{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}),
                equalTo("B"));
    }

    @Test
    void tictactoe3() {
        assertThat(
                new Solution()
                        .tictactoe(
                                new int[][] {
                                    {0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2},
                                    {2, 2}
                                }),
                equalTo("Draw"));
    }
}
