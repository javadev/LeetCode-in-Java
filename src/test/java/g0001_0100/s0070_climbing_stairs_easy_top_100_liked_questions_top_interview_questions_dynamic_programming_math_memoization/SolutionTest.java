package g0001_0100.s0070_climbing_stairs_easy_top_100_liked_questions_top_interview_questions_dynamic_programming_math_memoization;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void climbStairs() {
        assertThat(new Solution().climbStairs(2), equalTo(2));
    }
}
