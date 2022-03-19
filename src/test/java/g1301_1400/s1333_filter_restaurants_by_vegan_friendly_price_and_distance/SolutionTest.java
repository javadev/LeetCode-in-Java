package g1301_1400.s1333_filter_restaurants_by_vegan_friendly_price_and_distance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void filterRestaurants() {
        int[][] restaurants =
                new int[][] {
                    {1, 4, 1, 40, 10},
                    {2, 8, 0, 50, 5},
                    {3, 8, 1, 30, 4},
                    {4, 10, 0, 10, 3},
                    {5, 1, 1, 15, 1}
                };
        assertThat(
                new Solution().filterRestaurants(restaurants, 1, 50, 10),
                equalTo(Arrays.asList(3, 1, 5)));
    }

    @Test
    void filterRestaurants2() {
        int[][] restaurants =
                new int[][] {
                    {1, 4, 1, 40, 10},
                    {2, 8, 0, 50, 5},
                    {3, 8, 1, 30, 4},
                    {4, 10, 0, 10, 3},
                    {5, 1, 1, 15, 1}
                };
        assertThat(
                new Solution().filterRestaurants(restaurants, 0, 50, 10),
                equalTo(Arrays.asList(4, 3, 2, 1, 5)));
    }

    @Test
    void filterRestaurants3() {
        int[][] restaurants =
                new int[][] {
                    {1, 4, 1, 40, 10},
                    {2, 8, 0, 50, 5},
                    {3, 8, 1, 30, 4},
                    {4, 10, 0, 10, 3},
                    {5, 1, 1, 15, 1}
                };
        assertThat(
                new Solution().filterRestaurants(restaurants, 0, 30, 3),
                equalTo(Arrays.asList(4, 5)));
    }
}
