package g0101_0200.s0179_largest_number_medium_top_interview_questions_string_sorting_greedy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void largestNumber() {
        assertThat(new Solution().largestNumber(new int[] {10, 2}), equalTo("210"));
    }
}
