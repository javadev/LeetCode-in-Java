package g0601_0700.s0650_2_keys_keyboard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSteps() {
        assertThat(new Solution().minSteps(3), equalTo(3));
    }

    @Test
    void minSteps2() {
        assertThat(new Solution().minSteps(1), equalTo(0));
    }
}
