package g0601_0700.s0672_bulb_switcher_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void flipLights() {
        assertThat(new Solution().flipLights(1, 1), equalTo(2));
    }

    @Test
    void flipLights2() {
        assertThat(new Solution().flipLights(2, 1), equalTo(3));
    }

    @Test
    void flipLights3() {
        assertThat(new Solution().flipLights(3, 1), equalTo(4));
    }

    @Test
    void flipLights4() {
        assertThat(new Solution().flipLights(1, 0), equalTo(1));
    }

    @Test
    void flipLights5() {
        assertThat(new Solution().flipLights(3, 2), equalTo(7));
    }

    @Test
    void flipLights6() {
        assertThat(new Solution().flipLights(3, 3), equalTo(8));
    }

    @Test
    void flipLights7() {
        assertThat(new Solution().flipLights(4, 4), equalTo(8));
    }
}
