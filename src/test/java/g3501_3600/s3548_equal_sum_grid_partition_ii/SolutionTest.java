package g3501_3600.s3548_equal_sum_grid_partition_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canPartitionGrid() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{1, 4}, {2, 3}}), equalTo(true));
    }

    @Test
    void canPartitionGrid2() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{1, 2}, {3, 4}}), equalTo(true));
    }

    @Test
    void canPartitionGrid3() {
        assertThat(
                new Solution().canPartitionGrid(new int[][] {{1, 2, 4}, {2, 3, 5}}),
                equalTo(false));
    }

    @Test
    void canPartitionGrid4() {
        assertThat(
                new Solution().canPartitionGrid(new int[][] {{4, 1, 8}, {3, 2, 6}}),
                equalTo(false));
    }

    @Test
    void canPartitionGrid5() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{1}}), equalTo(false));
    }

    @Test
    void canPartitionGrid6() {
        assertThat(
                new Solution().canPartitionGrid(new int[][] {{25372, 100000, 100000}}),
                equalTo(true));
    }

    @Test
    void canPartitionGrid7() {
        assertThat(
                new Solution().canPartitionGrid(new int[][] {{100000, 100000, 100000, 100000, 1}}),
                equalTo(true));
    }

    @Test
    void canPartitionGrid8() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{55753, 55753}}), equalTo(true));
    }

    @Test
    void canPartitionGrid9() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{253, 10, 10}}), equalTo(true));
    }

    @Test
    void canPartitionGrid10() {
        assertThat(
                new Solution().canPartitionGrid(new int[][] {{4, 4, 4}, {2, 2, 1}, {1, 1, 1}}),
                equalTo(true));
    }

    @Test
    void canPartitionGrid11() {
        assertThat(
                new Solution()
                        .canPartitionGrid(
                                new int[][] {{2, 40, 2}, {4, 2, 3}, {5, 1, 6}, {7, 8, 9}}),
                equalTo(true));
    }

    @Test
    void canPartitionGrid12() {
        assertThat(
                new Solution().canPartitionGrid(new int[][] {{1, 5}, {2, 4}, {3, 3}}),
                equalTo(false));
    }

    @Test
    void canPartitionGrid13() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{1, 1}, {2, 0}}), equalTo(true));
    }

    @Test
    void canPartitionGrid14() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{5, 2}, {1, 1}}), equalTo(true));
    }

    @Test
    void canPartitionGrid15() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{4}, {1}, {3}}), equalTo(true));
    }

    @Test
    void canPartitionGrid16() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{5}, {3}, {2}}), equalTo(true));
    }

    @Test
    void canPartitionGrid17() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{2, 2, 4}}), equalTo(true));
    }

    @Test
    void canPartitionGrid18() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{3, 3, 1}}), equalTo(false));
    }

    @Test
    void canPartitionGrid19() {
        int[][] grid = {{100000, 100000}, {100000, 100000}};
        assertThat(new Solution().canPartitionGrid(grid), equalTo(true));
    }

    @Test
    void canPartitionGrid20() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{1, 2}, {4, 6}}), equalTo(false));
    }

    @Test
    void canPartitionGrid21() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{1, 2}, {4, 5}}), equalTo(true));
    }

    @Test
    void canPartitionGrid22() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{9, 1, 8}}), equalTo(true));
    }

    @Test
    void canPartitionGrid23() {
        assertThat(
                new Solution().canPartitionGrid(new int[][] {{2, 2}, {2, 2}, {1, 1}}),
                equalTo(true));
    }

    @Test
    void canPartitionGrid24() {
        Solution solution = new Solution();
        int[][] grid = {
            {2, 1},
            {1, 1}
        };
        assertThat(solution.canPartitionGrid(grid), equalTo(true));
    }

    @Test
    void canPartitionGrid2325() {
        Solution solution = new Solution();
        int[][] grid = {{1}, {2}, {1}};
        assertThat(solution.canPartitionGrid(grid), equalTo(true));
    }

    @Test
    void canPartitionGrid26() {
        Solution solution = new Solution();
        int[][] grid = {
            {1, 2},
            {1, 1}
        };
        assertThat(solution.canPartitionGrid(grid), equalTo(true));
    }

    @Test
    void canPartitionGrid27() {
        Solution solution = new Solution();
        int[][] grid = {
            {1, 1, 2},
            {1, 1, 1}
        };
        assertThat(solution.canPartitionGrid(grid), equalTo(true));
    }

    @Test
    void canPartitionGrid28() {
        Solution solution = new Solution();
        int[][] grid = {
            {1, 1},
            {1, 1}
        };
        assertThat(solution.canPartitionGrid(grid), equalTo(true));
    }

    @Test
    void canPartitionGrid29() {
        Solution solution = new Solution();
        int[][] grid = {
            {1, 2},
            {3, 4}
        };
        assertThat(solution.canPartitionGrid(grid), equalTo(true));
    }
}
