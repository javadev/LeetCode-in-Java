package g3401_3500.s3473_sum_of_k_subarrays_with_length_at_least_m;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(new Solution().maxSum(new int[] {1, 2, -1, 3, 3, 4}, 2, 2), equalTo(13));
    }

    @Test
    void maxSum2() {
        assertThat(new Solution().maxSum(new int[] {-10, 3, -1, -2}, 4, 1), equalTo(-10));
    }
}
