package g1101_1200.s1186_maximum_subarray_sum_with_one_deletion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSum() {
        assertThat(new Solution().maximumSum(new int[] {1, -2, 0, 3}), equalTo(4));
    }

    @Test
    void maximumSum2() {
        assertThat(new Solution().maximumSum(new int[] {-1, -1, -1, -1}), equalTo(-1));
    }

    @Test
    void maximumSum3() {
        assertThat(new Solution().maximumSum(new int[] {-1, -2, -2, -3}), equalTo(-1));
    }
}
