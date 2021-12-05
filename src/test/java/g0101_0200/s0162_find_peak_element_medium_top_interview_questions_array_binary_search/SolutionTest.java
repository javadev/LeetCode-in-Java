package g0101_0200.s0162_find_peak_element_medium_top_interview_questions_array_binary_search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void findPeakElement() {
        assertThat(new Solution().findPeakElement(new int[] {1, 2, 3, 1}), equalTo(2));
    }
}
