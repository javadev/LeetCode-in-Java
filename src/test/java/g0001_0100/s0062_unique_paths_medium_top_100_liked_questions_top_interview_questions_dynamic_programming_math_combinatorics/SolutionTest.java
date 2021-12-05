package g0001_0100.s0062_unique_paths_medium_top_100_liked_questions_top_interview_questions_dynamic_programming_math_combinatorics;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void uniquePaths() {
        assertThat(new Solution().uniquePaths(3, 7), equalTo(28));
    }
}
