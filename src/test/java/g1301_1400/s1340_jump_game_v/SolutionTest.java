package g1301_1400.s1340_jump_game_v;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxJumps() {
        assertThat(
                new Solution().maxJumps(new int[] {6, 4, 14, 6, 8, 13, 9, 7, 10, 6, 12}, 2),
                equalTo(4));
    }

    @Test
    void maxJumps2() {
        assertThat(new Solution().maxJumps(new int[] {3, 3, 3, 3, 3}, 3), equalTo(1));
    }

    @Test
    void maxJumps3() {
        assertThat(new Solution().maxJumps(new int[] {7, 6, 5, 4, 3, 2, 1}, 1), equalTo(7));
    }
}
