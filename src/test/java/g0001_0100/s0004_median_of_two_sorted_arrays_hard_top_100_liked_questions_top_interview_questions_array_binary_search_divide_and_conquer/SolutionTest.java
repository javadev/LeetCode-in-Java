package g0001_0100.s0004_median_of_two_sorted_arrays_hard_top_100_liked_questions_top_interview_questions_array_binary_search_divide_and_conquer;

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
