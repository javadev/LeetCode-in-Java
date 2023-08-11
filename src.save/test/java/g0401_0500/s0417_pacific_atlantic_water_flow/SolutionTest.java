package g0401_0500.s0417_pacific_atlantic_water_flow;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pacificAtlantic() {
        int[][] matrix = {
            {2, 3, 5},
            {3, 4, 4},
            {5, 3, 1},
        };
        assertThat(
                new Solution().pacificAtlantic(matrix),
                equalTo(ArrayUtils.getLists(new int[][] {{0, 2}, {1, 1}, {1, 2}, {2, 0}})));
    }

    @Test
    void pacificAtlantic2() {
        int[][] matrix = {{1}};
        assertThat(
                new Solution().pacificAtlantic(matrix),
                equalTo(ArrayUtils.getLists(new int[][] {{0, 0}})));
    }
}
