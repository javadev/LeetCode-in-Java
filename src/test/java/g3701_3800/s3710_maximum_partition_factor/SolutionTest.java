package g3701_3800.s3710_maximum_partition_factor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPartitionFactor() {
        assertThat(
                new Solution().maxPartitionFactor(new int[][] {{0, 0}, {0, 2}, {2, 0}, {2, 2}}),
                equalTo(4));
    }

    @Test
    void maxPartitionFactor2() {
        assertThat(
                new Solution().maxPartitionFactor(new int[][] {{0, 0}, {0, 1}, {10, 0}}),
                equalTo(11));
    }
}
