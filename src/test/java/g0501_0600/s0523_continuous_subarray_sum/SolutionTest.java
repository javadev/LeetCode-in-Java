package g0501_0600.s0523_continuous_subarray_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkSubarraySum() {
        assertThat(new Solution().checkSubarraySum(new int[] {23, 2, 4, 6, 7}, 6), equalTo(true));
    }

    @Test
    void checkSubarraySum2() {
        assertThat(new Solution().checkSubarraySum(new int[] {23, 2, 6, 4, 7}, 6), equalTo(true));
    }

    @Test
    void checkSubarraySum3() {
        assertThat(new Solution().checkSubarraySum(new int[] {23, 2, 6, 4, 7}, 13), equalTo(false));
    }
}
