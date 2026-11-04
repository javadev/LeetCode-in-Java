package g3901_4000.s3984_divisible_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void divisibleGame() {
        assertThat(new Solution().divisibleGame(new int[] {1, 4, 6, 8}), equalTo(36));
    }

    @Test
    void divisibleGame2() {
        assertThat(new Solution().divisibleGame(new int[] {2, 1, 2}), equalTo(6));
    }

    @Test
    void divisibleGame3() {
        assertThat(new Solution().divisibleGame(new int[] {1}), equalTo(1000000005));
    }
}
