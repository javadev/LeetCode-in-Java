package g1001_1100.s1025_divisor_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void divisorGame() {
        assertThat(new Solution().divisorGame(2), equalTo(true));
    }

    @Test
    void divisorGame2() {
        assertThat(new Solution().divisorGame(3), equalTo(false));
    }
}
