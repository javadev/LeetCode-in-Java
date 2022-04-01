package g0801_0900.s0856_score_of_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void scoreOfParentheses() {
        assertThat(new Solution().scoreOfParentheses("()"), equalTo(1));
    }

    @Test
    void scoreOfParentheses2() {
        assertThat(new Solution().scoreOfParentheses("(())"), equalTo(2));
    }

    @Test
    void scoreOfParentheses3() {
        assertThat(new Solution().scoreOfParentheses("()()"), equalTo(2));
    }
}
