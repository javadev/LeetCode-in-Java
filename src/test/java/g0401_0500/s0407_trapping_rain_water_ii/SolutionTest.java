package g0401_0500.s0407_trapping_rain_water_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void trapRainWater() {
        assertThat(
                new Solution()
                        .trapRainWater(
                                new int[][] {
                                    {1, 4, 3, 1, 3, 2}, {3, 2, 1, 3, 2, 4}, {2, 3, 3, 2, 3, 1}
                                }),
                equalTo(4));
    }

    @Test
    void trapRainWater2() {
        assertThat(
                new Solution()
                        .trapRainWater(
                                new int[][] {
                                    {3, 3, 3, 3, 3},
                                    {3, 2, 2, 2, 3},
                                    {3, 2, 1, 2, 3},
                                    {3, 2, 2, 2, 3},
                                    {3, 3, 3, 3, 3}
                                }),
                equalTo(10));
    }
}
