package g3601_3700.s3660_jump_game_ix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxValue() {
        assertThat(new Solution().maxValue(new int[] {2, 1, 3}), equalTo(new int[] {2, 2, 3}));
    }

    @Test
    void maxValue2() {
        assertThat(new Solution().maxValue(new int[] {2, 3, 1}), equalTo(new int[] {3, 3, 3}));
    }
}
