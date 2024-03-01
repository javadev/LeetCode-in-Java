package g0901_1000.s0930_binary_subarrays_with_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSubarraysWithSum() {
        assertThat(new Solution().numSubarraysWithSum(new int[] {1, 0, 1, 0, 1}, 2), equalTo(4));
    }

    @Test
    void numSubarraysWithSum2() {
        assertThat(new Solution().numSubarraysWithSum(new int[] {0, 0, 0, 0, 0}, 0), equalTo(15));
    }
}
