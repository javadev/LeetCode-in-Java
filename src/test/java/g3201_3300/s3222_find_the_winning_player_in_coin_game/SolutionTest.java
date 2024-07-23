package g3201_3300.s3222_find_the_winning_player_in_coin_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void losingPlayer() {
        assertThat(new Solution().losingPlayer(2, 7), equalTo("Alice"));
    }

    @Test
    void losingPlayer2() {
        assertThat(new Solution().losingPlayer(4, 11), equalTo("Bob"));
    }
}
