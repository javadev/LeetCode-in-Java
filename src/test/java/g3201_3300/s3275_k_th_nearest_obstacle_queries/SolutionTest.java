package g3201_3300.s3275_k_th_nearest_obstacle_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void resultsArray() {
        assertThat(
                new Solution().resultsArray(new int[][] {{1, 2}, {3, 4}, {2, 3}, {-3, 0}}, 2),
                equalTo(new int[] {-1, 7, 5, 3}));
    }

    @Test
    void resultsArray2() {
        assertThat(
                new Solution().resultsArray(new int[][] {{5, 5}, {4, 4}, {3, 3}}, 1),
                equalTo(new int[] {10, 8, 6}));
    }
}
