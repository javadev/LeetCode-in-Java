package g0301_0400.s0319_bulb_switcher;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bulbSwitch() {
        assertThat(new Solution().bulbSwitch(1), equalTo(1));
    }

    @Test
    void bulbSwitch2() {
        assertThat(new Solution().bulbSwitch(4), equalTo(2));
    }
}
