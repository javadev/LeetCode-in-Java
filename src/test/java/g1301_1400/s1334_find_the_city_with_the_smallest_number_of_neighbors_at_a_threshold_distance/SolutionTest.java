package g1301_1400.s1334_find_the_city_with_the_smallest_number_of_neighbors_at_a_threshold_distance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTheCity() {
        int[][] edges = new int[][] {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        assertThat(new Solution().findTheCity(4, edges, 4), equalTo(3));
    }

    @Test
    void findTheCity2() {
        int[][] edges =
                new int[][] {{0, 1, 2}, {0, 4, 8}, {1, 2, 3}, {1, 4, 2}, {2, 3, 1}, {3, 4, 1}};
        assertThat(new Solution().findTheCity(5, edges, 2), equalTo(0));
    }
}
