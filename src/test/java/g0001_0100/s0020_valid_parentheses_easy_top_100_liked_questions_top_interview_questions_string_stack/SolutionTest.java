package g0001_0100.s0020_valid_parentheses_easy_top_100_liked_questions_top_interview_questions_string_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isValid() {
        Solution solution = new Solution();
        assertThat(solution.isValid("()"), equalTo(true));
        assertThat(solution.isValid("()[]{}"), equalTo(true));
        assertThat(solution.isValid("(]"), equalTo(false));
        assertThat(solution.isValid("([)]"), equalTo(false));
        assertThat(solution.isValid("{[]}"), equalTo(true));
    }
}
