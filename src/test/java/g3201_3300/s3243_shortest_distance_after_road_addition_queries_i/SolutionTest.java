package g3201_3300.s3243_shortest_distance_after_road_addition_queries_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestDistanceAfterQueries() {
        assertThat(
                new Solution()
                        .shortestDistanceAfterQueries(5, new int[][] {{2, 4}, {0, 2}, {0, 4}}),
                equalTo(new int[] {3, 2, 1}));
    }

    @Test
    void shortestDistanceAfterQueries2() {
        assertThat(
                new Solution().shortestDistanceAfterQueries(4, new int[][] {{0, 3}, {0, 2}}),
                equalTo(new int[] {1, 1}));
    }
}
