package g0001_0100.s0020_valid_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isValid() {
        assertThat(new Solution().isValid("()"), equalTo(true));
    }

    @Test
    void isValid2() {
        assertThat(new Solution().isValid("()[]{}"), equalTo(true));
    }

    @Test
    void isValid3() {
        assertThat(new Solution().isValid("(]"), equalTo(false));
    }

    @Test
    void isValid4() {
        assertThat(new Solution().isValid("([)]"), equalTo(false));
    }

    @Test
    void isValid5() {
        assertThat(new Solution().isValid("{[]}"), equalTo(true));
    }
}
