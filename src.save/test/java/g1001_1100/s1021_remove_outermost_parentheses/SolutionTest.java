package g1001_1100.s1021_remove_outermost_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeOuterParentheses() {
        assertThat(new Solution().removeOuterParentheses("(()())(())"), equalTo("()()()"));
    }

    @Test
    void removeOuterParentheses2() {
        assertThat(
                new Solution().removeOuterParentheses("(()())(())(()(()))"),
                equalTo("()()()()(())"));
    }

    @Test
    void removeOuterParentheses3() {
        assertThat(new Solution().removeOuterParentheses("()()"), equalTo(""));
    }
}
