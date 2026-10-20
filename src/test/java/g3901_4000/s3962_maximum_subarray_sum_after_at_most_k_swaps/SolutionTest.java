package g3901_4000.s3962_maximum_subarray_sum_after_at_most_k_swaps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(new Solution().maxSum(new int[] {1, -1, 0, 2}, 1), equalTo(3L));
    }

    @Test
    void maxSum2() {
        assertThat(new Solution().maxSum(new int[] {4, 3, 2, 4}, 2), equalTo(13L));
    }

    @Test
    void maxSum3() {
        assertThat(new Solution().maxSum(new int[] {-1, -2}, 0), equalTo(-1L));
    }
}
