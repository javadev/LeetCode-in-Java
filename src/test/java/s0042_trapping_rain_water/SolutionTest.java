package s0042_trapping_rain_water;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void trappingRainWater() {
        assertThat(new Solution().trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), equalTo(6));
    }
}
