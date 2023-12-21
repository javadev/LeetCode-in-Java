package g0001_0100.s0064_minimum_path_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPathSum() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertThat(new Solution().minPathSum(grid), equalTo(7));
    }

    @Test
    void minPathSum2() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        assertThat(new Solution().minPathSum(grid), equalTo(12));
    }
}
