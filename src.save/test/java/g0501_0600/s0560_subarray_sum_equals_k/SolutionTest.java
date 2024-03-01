package g0501_0600.s0560_subarray_sum_equals_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subarraySum() {
        assertThat(new Solution().subarraySum(new int[] {1, 1, 1}, 2), equalTo(2));
    }

    @Test
    void subarraySum2() {
        assertThat(new Solution().subarraySum(new int[] {1, 2, 3}, 3), equalTo(2));
    }
}
