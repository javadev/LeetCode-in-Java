package g3401_3500.s3430_maximum_and_minimum_sums_of_at_most_size_k_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMaxSubarraySum() {
        assertThat(new Solution().minMaxSubarraySum(new int[] {1, 2, 3}, 2), equalTo(20L));
    }

    @Test
    void minMaxSubarraySum2() {
        assertThat(new Solution().minMaxSubarraySum(new int[] {1, -3, 1}, 2), equalTo(-6L));
    }
}
