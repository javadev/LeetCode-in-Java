package g0601_0700.s0678_valid_parenthesis_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkValidString() {
        assertThat(new Solution().checkValidString("()"), equalTo(true));
    }

    @Test
    void checkValidString2() {
        assertThat(new Solution().checkValidString("(*)"), equalTo(true));
    }

    @Test
    void checkValidString3() {
        assertThat(new Solution().checkValidString("(*))"), equalTo(true));
    }
}
