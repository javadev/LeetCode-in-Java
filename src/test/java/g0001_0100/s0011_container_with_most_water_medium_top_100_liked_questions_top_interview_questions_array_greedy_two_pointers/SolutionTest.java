package g0001_0100.s0011_container_with_most_water_medium_top_100_liked_questions_top_interview_questions_array_greedy_two_pointers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxArea() {
        assertThat(new Solution().maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}), equalTo(49));
    }
}
