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

    @Test
    void distanceBetweenBusStops4() {
        assertThat(
                new Solution().distanceBetweenBusStops(new int[] {1, 2, 3, 4}, 3, 1), equalTo(5));
    }

    @Test
    void distanceBetweenBusStops5() {
        assertThat(
                new Solution().distanceBetweenBusStops(new int[] {7, 1, 2, 3}, 1, 3), equalTo(3));
    }

    @Test
    void distanceBetweenBusStops6() {
        assertThat(
                new Solution().distanceBetweenBusStops(new int[] {2, 2, 2, 2}, 1, 3), equalTo(4));
    }

    @Test
    void distanceBetweenBusStops7() {
        assertThat(new Solution().distanceBetweenBusStops(new int[] {5}, 0, 0), equalTo(0));
    }

    @Test
    void distanceBetweenBusStops8() {
        assertThat(new Solution().distanceBetweenBusStops(new int[] {3, 8}, 1, 0), equalTo(3));
    }

    @Test
    void distanceBetweenBusStops9() {
        assertThat(
                new Solution().distanceBetweenBusStops(new int[] {1, 4, 6, 3}, 2, 1), equalTo(4));
    }
}
