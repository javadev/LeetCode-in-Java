package g3901_4000.s3976_maximum_subarray_sum_after_multiplier;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubarraySum() {
        assertThat(new Solution().maxSubarraySum(new int[] {1, -2, 3, 4, -5}, 2), equalTo(14L));
    }

    @Test
    void maxSubarraySum2() {
        assertThat(new Solution().maxSubarraySum(new int[] {-5, -4, -3}, 2), equalTo(-1L));
    }

    @Test
    void maxSubarraySum3() {
        assertThat(new Solution().maxSubarraySum(new int[] {1, 2, 3}, 2), equalTo(12L));
    }
}
