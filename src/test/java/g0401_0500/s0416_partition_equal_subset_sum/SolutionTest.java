package g0401_0500.s0416_partition_equal_subset_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canPartition() {
        assertThat(new Solution().canPartition(new int[] {1, 5, 11, 5}), equalTo(true));
    }

    @Test
    void canPartition2() {
        assertThat(new Solution().canPartition(new int[] {1, 2, 3, 5}), equalTo(false));
    }
}
