package g0401_0500.s0488_zuma_game;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void findRadius() {
        assertThat(new Solution().findMinStep("WRRBBW","RB"), equalTo(-1));
    }

    @Test
    void findRadius2() {
        assertThat(new Solution().findMinStep("WWRRBBWW","WRBRW"), equalTo(2));
    }

    @Test
    void findRadius3() {
        assertThat(new Solution().findMinStep("G","GGGGG"), equalTo(2));
    }
}
