package g0001_0100.s0020_valid_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

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
