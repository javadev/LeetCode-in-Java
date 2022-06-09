package g2101_2200.s2104_sum_of_subarray_ranges;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subArrayRanges() {
        assertThat(new Solution().subArrayRanges(new int[] {1, 2, 3}), equalTo(4L));
    }

    @Test
    void subArrayRanges2() {
        assertThat(new Solution().subArrayRanges(new int[] {1, 3, 3}), equalTo(4L));
    }

    @Test
    void subArrayRanges3() {
        assertThat(new Solution().subArrayRanges(new int[] {4, -2, -3, 4, 1}), equalTo(59L));
    }
}
