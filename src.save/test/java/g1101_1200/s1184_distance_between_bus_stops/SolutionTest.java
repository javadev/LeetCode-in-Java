package g1101_1200.s1184_distance_between_bus_stops;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distanceBetweenBusStops() {
        assertThat(
                new Solution().distanceBetweenBusStops(new int[] {1, 2, 3, 4}, 0, 1), equalTo(1));
    }

    @Test
    void distanceBetweenBusStops2() {
        assertThat(
                new Solution().distanceBetweenBusStops(new int[] {1, 2, 3, 4}, 0, 2), equalTo(3));
    }

    @Test
    void distanceBetweenBusStops3() {
        assertThat(
                new Solution().distanceBetweenBusStops(new int[] {1, 2, 3, 4}, 0, 3), equalTo(4));
    }
}
