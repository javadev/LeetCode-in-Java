package g3501_3600.s3546_equal_sum_grid_partition_i;

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
        assertThat(new Solution().canPartitionGrid(new int[][] {{1, 3}, {2, 4}}), equalTo(false));
    }

    @Test
    void canPartitionGrid3() {
        assertThat(new Solution().canPartitionGrid(new int[][] {{1}}), equalTo(false));
    }
}
