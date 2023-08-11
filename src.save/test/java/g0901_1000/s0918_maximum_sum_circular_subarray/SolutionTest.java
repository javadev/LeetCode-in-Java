package g0901_1000.s0918_maximum_sum_circular_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubarraySumCircular() {
        assertThat(new Solution().maxSubarraySumCircular(new int[] {1, -2, 3, -2}), equalTo(3));
    }

    @Test
    void maxSubarraySumCircular2() {
        assertThat(new Solution().maxSubarraySumCircular(new int[] {5, -3, 5}), equalTo(10));
    }

    @Test
    void maxSubarraySumCircular3() {
        assertThat(new Solution().maxSubarraySumCircular(new int[] {-3, -2, -3}), equalTo(-2));
    }
}
