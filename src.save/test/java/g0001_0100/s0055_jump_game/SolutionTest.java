package g0001_0100.s0055_jump_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canJump() {
        assertThat(new Solution().canJump(new int[] {2, 3, 1, 1, 4}), equalTo(true));
    }
}
