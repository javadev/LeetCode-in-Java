package g0001_0100.s0055_jump_game_medium_top_100_liked_questions_top_interview_questions_array_dynamic_programming_greedy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void canJump() {
        assertThat(new Solution().canJump(new int[] {2, 3, 1, 1, 4}), equalTo(true));
    }
}
