package g0001_0100.s0032_longest_valid_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

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
