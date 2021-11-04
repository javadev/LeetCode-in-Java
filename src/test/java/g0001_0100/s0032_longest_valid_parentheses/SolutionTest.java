package g0001_0100.s0032_longest_valid_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestValidParentheses() {
        assertThat(new Solution().longestValidParentheses("(()"), equalTo(2));
    }
}
