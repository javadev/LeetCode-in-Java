package g0301_0400.s0365_water_and_jug_problem;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMeasureWater() {
        assertThat(new Solution().canMeasureWater(3, 5, 4), equalTo(true));
    }

    @Test
    void canMeasureWater2() {
        assertThat(new Solution().canMeasureWater(2, 6, 5), equalTo(false));
    }

    @Test
    void canMeasureWater3() {
        assertThat(new Solution().canMeasureWater(1, 2, 3), equalTo(true));
    }
}
