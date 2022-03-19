package g1301_1400.s1326_minimum_number_of_taps_to_open_to_water_a_garden;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTaps() {
        assertThat(new Solution().minTaps(5, new int[] {3, 4, 1, 1, 0, 0}), equalTo(1));
    }

    @Test
    void minTaps2() {
        assertThat(new Solution().minTaps(3, new int[] {0, 0, 0, 0}), equalTo(-1));
    }
}
