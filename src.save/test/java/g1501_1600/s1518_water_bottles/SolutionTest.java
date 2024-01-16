package g1501_1600.s1518_water_bottles;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numWaterBottles() {
        assertThat(new Solution().numWaterBottles(9, 3), equalTo(13));
    }

    @Test
    void numWaterBottles2() {
        assertThat(new Solution().numWaterBottles(15, 4), equalTo(19));
    }
}
