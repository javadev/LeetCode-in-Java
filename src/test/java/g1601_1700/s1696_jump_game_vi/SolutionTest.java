package g1601_1700.s1696_jump_game_vi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxResult() {
        assertThat(new Solution().maxResult(new int[] {1, -1, -2, 4, -7, 3}, 2), equalTo(7));
    }

    @Test
    void maxResult2() {
        assertThat(new Solution().maxResult(new int[] {10, -5, -2, 4, 0, 3}, 3), equalTo(17));
    }

    @Test
    void maxResult3() {
        assertThat(
                new Solution().maxResult(new int[] {1, -5, -20, 4, -1, 3, -6, -3}, 2), equalTo(0));
    }
}
