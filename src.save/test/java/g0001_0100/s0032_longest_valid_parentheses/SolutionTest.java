package g0001_0100.s0032_longest_valid_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestValidParentheses() {
        assertThat(new Solution().longestValidParentheses("(()"), equalTo(2));
    }

    @Test
    void longestValidParentheses2() {
        assertThat(new Solution().longestValidParentheses(")()())"), equalTo(4));
    }

    @Test
    void longestValidParentheses3() {
        assertThat(new Solution().longestValidParentheses(""), equalTo(0));
    }
}
