package g0901_1000.s0907_sum_of_subarray_minimums;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumSubarrayMins() {
        assertThat(new Solution().sumSubarrayMins(new int[] {3, 1, 2, 4}), equalTo(17));
    }

    @Test
    void sumSubarrayMins2() {
        assertThat(new Solution().sumSubarrayMins(new int[] {11, 81, 94, 43, 3}), equalTo(444));
    }
}
