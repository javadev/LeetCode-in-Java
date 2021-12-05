package g0001_0100.s0034_find_first_and_last_position_of_element_in_sorted_array_medium_top_100_liked_questions_top_interview_questions_array_binary_search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void searchRange() {
        int[] expected = new int[] {3, 4};
        int[] actual = new Solution().searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8);
        assertThat(actual, equalTo(expected));
    }
}
