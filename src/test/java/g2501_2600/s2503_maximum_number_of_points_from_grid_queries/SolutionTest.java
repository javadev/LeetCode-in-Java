package g2501_2600.s2503_maximum_number_of_points_from_grid_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPoints() {
        assertThat(
                new Solution()
                        .maxPoints(
                                new int[][] {{1, 2, 3}, {2, 5, 7}, {3, 5, 1}}, new int[] {5, 6, 2}),
                equalTo(new int[] {5, 8, 1}));
    }

    @Test
    void maxPoints2() {
        assertThat(
                new Solution().maxPoints(new int[][] {{5, 2, 1}, {1, 1, 2}}, new int[] {3}),
                equalTo(new int[] {0}));
    }
}
