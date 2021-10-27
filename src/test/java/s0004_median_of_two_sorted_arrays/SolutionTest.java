package s0004_median_of_two_sorted_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void findMedianSortedArrays() {
        assertThat(
                new Solution().findMedianSortedArrays(new int[] {1, 3}, new int[] {2}),
                equalTo(2.0));
    }
}
