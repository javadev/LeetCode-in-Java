package g0001_0100.s0004_median_of_two_sorted_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMedianSortedArrays() {
        assertThat(
                new Solution().findMedianSortedArrays(new int[] {1, 3}, new int[] {2}),
                equalTo(2.0));
    }

    @Test
    void findMedianSortedArrays2() {
        assertThat(
                new Solution().findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}),
                equalTo(2.5));
    }
}
