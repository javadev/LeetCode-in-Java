package g1501_1600.s1529_bulb_switcher_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minFlips() {
        assertThat(new Solution().minFlips("10111"), equalTo(3));
    }

    @Test
    void minFlips2() {
        assertThat(new Solution().minFlips("101"), equalTo(3));
    }

    @Test
    void minFlips3() {
        assertThat(new Solution().minFlips("00000"), equalTo(0));
    }
}
