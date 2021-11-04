package s0063_unique_paths_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void uniquePathsII() {
        int[][] expected = {
            {
                0, 0, 0,
            },
            {0, 1, 0},
            {0, 0, 0}
        };
        assertThat(new Solution().uniquePathsWithObstacles(expected), equalTo(2));
    }
}
