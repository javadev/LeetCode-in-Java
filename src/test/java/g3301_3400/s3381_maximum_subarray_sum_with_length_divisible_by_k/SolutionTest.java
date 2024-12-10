package g3301_3400.s3381_maximum_subarray_sum_with_length_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubarraySum() {
        assertThat(new Solution().maxSubarraySum(new int[] {1, 2}, 1), equalTo(3L));
    }

    @Test
    void maxSubarraySum2() {
        assertThat(new Solution().maxSubarraySum(new int[] {-1, -2, -3, -4, -5}, 4), equalTo(-10L));
    }

    @Test
    void maxSubarraySum3() {
        assertThat(new Solution().maxSubarraySum(new int[] {-5, 1, 2, -3, 4}, 2), equalTo(4L));
    }
}
