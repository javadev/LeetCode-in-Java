package g0001_0100.s0075_sort_colors_medium_top_100_liked_questions_top_interview_questions_array_sorting_two_pointers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void sortColors() {
        int[] array = {2, 0, 2, 1, 1, 0};
        new Solution().sortColors(array);
        assertThat(array, equalTo(new int[] {0, 0, 1, 1, 2, 2}));
    }
}
