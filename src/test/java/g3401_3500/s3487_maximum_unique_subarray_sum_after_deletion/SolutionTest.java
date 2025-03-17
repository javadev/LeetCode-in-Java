package g3401_3500.s3487_maximum_unique_subarray_sum_after_deletion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(new Solution().maxSum(new int[] {1, 2, 3, 4, 5}), equalTo(15));
    }

    @Test
    void maxSum2() {
        assertThat(new Solution().maxSum(new int[] {1, 1, 0, 1, 1}), equalTo(1));
    }

    @Test
    void maxSum3() {
        assertThat(new Solution().maxSum(new int[] {1, 2, -1, -2, 1, 0, -1}), equalTo(3));
    }

    @Test
    void maxSum4() {
        assertThat(new Solution().maxSum(new int[] {-100}), equalTo(-100));
    }
}
