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

    @Test
    void minSensors3() {
        int result = new Solution().minSensors(9, 9, 1);
        // 3x3 grid of sensors
        assertThat(result, equalTo(9));
    }

    @Test
    void minSensors4() {
        int result = new Solution().minSensors(10, 10, 1);
        // 4x4 sensors
        assertThat(result, equalTo(16));
    }

    @Test
    void minSensors5() {
        int result = new Solution().minSensors(2, 2, 1);
        // single sensor covers all
        assertThat(result, equalTo(1));
    }

    @Test
    void minSensors6() {
        int result = new Solution().minSensors(1, 10, 1);
        // only 1 row, needs 4 sensors along m
        assertThat(result, equalTo(4));
    }

    @Test
    void testLargeK() {
        int result = new Solution().minSensors(5, 5, 10);
        // one sensor covers everything
        assertThat(result, equalTo(1));
    }

    @Test
    void testKZero() {
        int result = new Solution().minSensors(3, 3, 0);
        // every cell needs a sensor
        assertThat(result, equalTo(9));
    }
}
