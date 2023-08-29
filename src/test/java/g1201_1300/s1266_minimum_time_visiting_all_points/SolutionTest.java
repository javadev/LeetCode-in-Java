package g1201_1300.s1266_minimum_time_visiting_all_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTimeToVisitAllPoints() {
        assertThat(
                new Solution().minTimeToVisitAllPoints(new int[][] {{1, 1}, {3, 4}, {-1, 0}}),
                equalTo(7));
    }

    @Test
    void minTimeToVisitAllPoints2() {
        assertThat(
                new Solution().minTimeToVisitAllPoints(new int[][] {{3, 2}, {-2, 2}}), equalTo(5));
    }
}
