package g2201_2300.s2290_minimum_obstacle_removal_to_reach_corner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumObstacles() {
        assertThat(
                new Solution().minimumObstacles(new int[][] {{0, 1, 1}, {1, 1, 0}, {1, 1, 0}}),
                equalTo(2));
    }

    @Test
    void minimumObstacles2() {
        assertThat(
                new Solution()
                        .minimumObstacles(
                                new int[][] {{0, 1, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}}),
                equalTo(0));
    }

    @Test
    void minimumObstacles3() {
        assertThat(new Solution().minimumObstacles(new int[][] {{1}}), equalTo(0));
    }
}
