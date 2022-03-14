package g1301_1400.s1306_jump_game_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canReach() {
        assertThat(new Solution().canReach(new int[] {4, 2, 3, 0, 3, 1, 2}, 5), equalTo(true));
    }

    @Test
    void canReach2() {
        assertThat(new Solution().canReach(new int[] {4, 2, 3, 0, 3, 1, 2}, 0), equalTo(true));
    }

    @Test
    void canReach3() {
        assertThat(new Solution().canReach(new int[] {3, 0, 2, 1, 2}, 2), equalTo(false));
    }
}
