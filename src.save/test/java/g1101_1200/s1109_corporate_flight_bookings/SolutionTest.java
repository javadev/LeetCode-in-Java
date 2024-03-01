package g1101_1200.s1109_corporate_flight_bookings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void corpFlightBookings() {
        assertThat(
                new Solution()
                        .corpFlightBookings(new int[][] {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}}, 5),
                equalTo(new int[] {10, 55, 45, 25, 25}));
    }

    @Test
    void corpFlightBookings2() {
        assertThat(
                new Solution().corpFlightBookings(new int[][] {{1, 2, 10}, {2, 2, 15}}, 2),
                equalTo(new int[] {10, 25}));
    }
}
