package g1501_1600.s1508_range_sum_of_sorted_subarray_sums;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rangeSum() {
        assertThat(new Solution().rangeSum(new int[] {1, 2, 3, 4}, 4, 1, 5), equalTo(13));
    }

    @Test
    void rangeSum2() {
        assertThat(new Solution().rangeSum(new int[] {1, 2, 3, 4}, 4, 3, 4), equalTo(6));
    }

    @Test
    void rangeSum3() {
        assertThat(new Solution().rangeSum(new int[] {1, 2, 3, 4}, 4, 1, 10), equalTo(50));
    }
}
