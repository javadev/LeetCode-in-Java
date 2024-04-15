package g0001_0100.s0045_jump_game_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void jump() {
        assertThat(new Solution().jump(new int[] {2, 3, 1, 1, 4}), equalTo(2));
    }

    @Test
    void jump2() {
        assertThat(new Solution().jump(new int[] {2, 3, 0, 1, 4}), equalTo(2));
    }
}
