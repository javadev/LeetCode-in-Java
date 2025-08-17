package g3601_3700.s3648_minimum_sensors_to_cover_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSensors() {
        assertThat(new Solution().minSensors(5, 5, 1), equalTo(4));
    }

    @Test
    void minSensors2() {
        assertThat(new Solution().minSensors(2, 2, 2), equalTo(1));
    }
}
