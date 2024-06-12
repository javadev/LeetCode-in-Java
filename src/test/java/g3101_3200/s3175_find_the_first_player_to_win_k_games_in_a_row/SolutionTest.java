package g3101_3200.s3175_find_the_first_player_to_win_k_games_in_a_row;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findWinningPlayer() {
        assertThat(new Solution().findWinningPlayer(new int[] {4, 2, 6, 3, 9}, 2), equalTo(2));
    }

    @Test
    void findWinningPlayer2() {
        assertThat(new Solution().findWinningPlayer(new int[] {2, 5, 4}, 3), equalTo(1));
    }
}
