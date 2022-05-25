package g0001_0100.s0042_trapping_rain_water;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void trap() {
        assertThat(new Solution().trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), equalTo(6));
    }

    @Test
    void trap2() {
        assertThat(new Solution().trap(new int[] {4, 2, 0, 3, 2, 5}), equalTo(9));
    }
}
