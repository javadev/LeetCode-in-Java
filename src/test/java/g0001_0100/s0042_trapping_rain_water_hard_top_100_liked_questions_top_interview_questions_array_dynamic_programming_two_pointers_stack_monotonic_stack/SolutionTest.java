package g0001_0100.s0042_trapping_rain_water_hard_top_100_liked_questions_top_interview_questions_array_dynamic_programming_two_pointers_stack_monotonic_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void trap() {
        assertThat(new Solution().trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), equalTo(6));
    }
}
