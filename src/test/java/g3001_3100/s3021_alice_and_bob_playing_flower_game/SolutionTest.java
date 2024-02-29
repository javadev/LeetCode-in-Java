package g3001_3100.s3021_alice_and_bob_playing_flower_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void flowerGame() {
        assertThat(new Solution().flowerGame(3, 2), equalTo(3L));
    }

    @Test
    void flowerGame2() {
        assertThat(new Solution().flowerGame(1, 1), equalTo(0L));
    }
}
