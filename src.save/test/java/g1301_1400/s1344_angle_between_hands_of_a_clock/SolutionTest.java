package g1301_1400.s1344_angle_between_hands_of_a_clock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void angleClock() {
        assertThat(new Solution().angleClock(12, 30), equalTo(165.0));
    }

    @Test
    void angleClock2() {
        assertThat(new Solution().angleClock(3, 30), equalTo(75.0));
    }

    @Test
    void angleClock3() {
        assertThat(new Solution().angleClock(3, 15), equalTo(7.5));
    }
}
