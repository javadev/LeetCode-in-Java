package g3001_3100.s3026_maximum_good_subarray_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSubarraySum() {
        assertThat(
                new Solution().maximumSubarraySum(new int[] {1, 2, 3, 4, 5, 6}, 1), equalTo(11L));
    }

    @Test
    void maximumSubarraySum2() {
        assertThat(new Solution().maximumSubarraySum(new int[] {-1, 3, 2, 4, 5}, 3), equalTo(11L));
    }

    @Test
    void maximumSubarraySum3() {
        assertThat(new Solution().maximumSubarraySum(new int[] {-1, -2, -3, -4}, 2), equalTo(-6L));
    }
}
