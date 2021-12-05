package g0001_0100.s0045_jump_game_ii_medium_top_100_liked_questions_array_dynamic_programming_greedy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void jump() {
        assertThat(new Solution().jump(new int[] {2, 3, 1, 1, 4}), equalTo(2));
    }
}
