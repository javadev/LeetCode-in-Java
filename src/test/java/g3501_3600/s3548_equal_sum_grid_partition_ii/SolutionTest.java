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
}
