package g0701_0800.s0787_cheapest_flights_within_k_stops;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findCheapestPrice() {
        assertThat(
                new Solution()
                        .findCheapestPrice(
                                3, new int[][] {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1),
                equalTo(200));
    }

    @Test
    void findCheapestPrice2() {
        assertThat(
                new Solution()
                        .findCheapestPrice(
                                3, new int[][] {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0),
                equalTo(500));
    }
}
