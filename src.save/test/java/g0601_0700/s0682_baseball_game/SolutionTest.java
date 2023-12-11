package g0601_0700.s0682_baseball_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void calPoints() {
        assertThat(new Solution().calPoints(new String[] {"5", "2", "C", "D", "+"}), equalTo(30));
    }

    @Test
    void calPoints2() {
        assertThat(
                new Solution().calPoints(new String[] {"5", "-2", "4", "C", "D", "9", "+", "+"}),
                equalTo(27));
    }

    @Test
    void calPoints3() {
        assertThat(new Solution().calPoints(new String[] {"1"}), equalTo(1));
    }
}
