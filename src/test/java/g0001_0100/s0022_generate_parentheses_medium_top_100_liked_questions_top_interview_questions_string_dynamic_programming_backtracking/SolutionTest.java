package g0001_0100.s0022_generate_parentheses_medium_top_100_liked_questions_top_interview_questions_string_dynamic_programming_backtracking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void generateParenthesis() {
        assertThat(
                new Solution().generateParenthesis(3),
                equalTo(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")));
    }
}
