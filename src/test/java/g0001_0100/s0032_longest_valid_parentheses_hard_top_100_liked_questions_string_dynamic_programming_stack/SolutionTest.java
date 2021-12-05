package g0001_0100.s0032_longest_valid_parentheses_hard_top_100_liked_questions_string_dynamic_programming_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestValidParentheses() {
        assertThat(new Solution().longestValidParentheses("(()"), equalTo(2));
    }

    @Test
    public void longestValidParentheses2() {
        assertThat(new Solution().longestValidParentheses(")()())"), equalTo(4));
    }

    @Test
    public void longestValidParentheses3() {
        assertThat(new Solution().longestValidParentheses(""), equalTo(0));
    }
}
