package g1201_1300.s1254_number_of_closed_islands;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closedIsland() {
        int[][] grid =
                new int[][] {
                    {1, 1, 1, 1, 1, 1, 1, 0},
                    {1, 0, 0, 0, 0, 1, 1, 0},
                    {1, 0, 1, 0, 1, 1, 1, 0},
                    {1, 0, 0, 0, 0, 1, 0, 1},
                    {1, 1, 1, 1, 1, 1, 1, 0}
                };
        assertThat(new Solution().closedIsland(grid), equalTo(2));
    }

    @Test
    void closedIsland2() {
        int[][] grid = new int[][] {{0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}};
        assertThat(new Solution().closedIsland(grid), equalTo(1));
    }

    @Test
    void closedIsland3() {
        int[][] grid =
                new int[][] {
                    {1, 1, 1, 1, 1, 1, 1},
                    {1, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 1, 1, 0, 1},
                    {1, 0, 1, 0, 1, 0, 1},
                    {1, 0, 1, 1, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 1},
                    {1, 1, 1, 1, 1, 1, 1}
                };
        assertThat(new Solution().closedIsland(grid), equalTo(2));
    }
}
