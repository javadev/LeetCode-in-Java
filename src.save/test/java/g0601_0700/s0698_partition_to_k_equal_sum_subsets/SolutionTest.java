package g0601_0700.s0698_partition_to_k_equal_sum_subsets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canPartitionKSubsets() {
        assertThat(
                new Solution().canPartitionKSubsets(new int[] {4, 3, 2, 3, 5, 2, 1}, 4),
                equalTo(true));
    }

    @Test
    void canPartitionKSubsets2() {
        assertThat(new Solution().canPartitionKSubsets(new int[] {1, 2, 3, 4}, 3), equalTo(false));
    }
}
