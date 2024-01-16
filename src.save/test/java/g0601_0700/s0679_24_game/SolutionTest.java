package g0601_0700.s0679_24_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void judgePoint24() {
        assertThat(new Solution().judgePoint24(new int[] {4, 1, 8, 7}), equalTo(true));
    }

    @Test
    void judgePoint242() {
        assertThat(new Solution().judgePoint24(new int[] {1, 2, 1, 2}), equalTo(false));
    }
}
