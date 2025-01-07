package g3401_3500.s3410_maximize_subarray_sum_after_removing_all_occurrences_of_one_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubarraySum() {
        assertThat(new Solution().maxSubarraySum(new int[] {-3, 2, -2, -1, 3, -2, 3}), equalTo(7L));
    }

    @Test
    void maxSubarraySum2() {
        assertThat(new Solution().maxSubarraySum(new int[] {1, 2, 3, 4}), equalTo(10L));
    }
}
