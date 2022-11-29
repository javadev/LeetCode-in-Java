package g0301_0400.s0301_remove_invalid_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeInvalidParentheses() {
        assertThat(
                new Solution().removeInvalidParentheses("()())()"),
                equalTo(Arrays.asList("(())()", "()()()")));
    }

    @Test
    void removeInvalidParentheses2() {
        assertThat(
                new Solution().removeInvalidParentheses("(a)())()"),
                equalTo(Arrays.asList("(a())()", "(a)()()")));
    }

    @Test
    void removeInvalidParentheses3() {
        assertThat(new Solution().removeInvalidParentheses(")("), equalTo(Arrays.asList("")));
    }
}
