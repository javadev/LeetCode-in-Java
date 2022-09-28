package g2301_2400.s2382_maximum_segment_sum_after_removals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSegmentSum() {
        assertThat(
                new Solution()
                        .maximumSegmentSum(new int[] {1, 2, 5, 6, 1}, new int[] {0, 3, 2, 4, 1}),
                equalTo(new long[] {14, 7, 2, 2, 0}));
    }

    @Test
    void maximumSegmentSum2() {
        assertThat(
                new Solution().maximumSegmentSum(new int[] {3, 2, 11, 1}, new int[] {3, 2, 1, 0}),
                equalTo(new long[] {16, 5, 3, 0}));
    }
}
