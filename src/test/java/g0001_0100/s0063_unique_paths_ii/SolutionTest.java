package g0001_0100.s0063_unique_paths_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uniquePathsWithObstacles() {
        assertThat(
                new Solution()
                        .uniquePathsWithObstacles(
                                new int[][] {
                                    {0, 0, 0},
                                    {0, 1, 0},
                                    {0, 0, 0}
                                }),
                equalTo(2));
    }

    @Test
    void uniquePathsWithObstacles2() {
        assertThat(
                new Solution().uniquePathsWithObstacles(new int[][] {{0, 1}, {0, 0}}), equalTo(1));
    }
}
