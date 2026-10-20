package g3901_4000.s3957_maximum_sum_of_m_non_overlapping_subarrays_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSum() {
        assertThat(new Solution().maximumSum(new int[] {4, 1, -5, 2}, 2, 1, 3), equalTo(7L));
    }

    @Test
    void maximumSum2() {
        assertThat(new Solution().maximumSum(new int[] {1, 0, 3, 4}, 2, 1, 2), equalTo(8L));
    }

    @Test
    void maximumSum3() {
        assertThat(new Solution().maximumSum(new int[] {-1, 7, -4}, 1, 2, 3), equalTo(6L));
    }

    @Test
    void maximumSum4() {
        assertThat(new Solution().maximumSum(new int[] {-3, -4, -1}, 2, 1, 2), equalTo(-1L));
    }

    @Test
    void maximumSum5() {
        assertThat(new Solution().maximumSum(new int[] {1, 1, 1, 1, 1}, 1, 1, 1), equalTo(1L));
    }

    @Test
    void maximumSum6() {
        assertThat(new Solution().maximumSum(new int[] {1, 2, 3, 4, 5}, 2, 1, 1), equalTo(9L));
    }
}
