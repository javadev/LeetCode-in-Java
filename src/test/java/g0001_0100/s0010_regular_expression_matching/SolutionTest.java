package g0001_0100.s0010_regular_expression_matching;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isMatch() {
        assertThat(new Solution().isMatch("aa", "a"), equalTo(false));
    }

    @Test
    void isMatch2() {
        assertThat(new Solution().isMatch("aa", "a*"), equalTo(true));
    }

    @Test
    void isMatch3() {
        assertThat(new Solution().isMatch("ab", ".*"), equalTo(true));
    }

    @Test
    void isMatch4() {
        assertThat(new Solution().isMatch("aab", "c*a*b"), equalTo(true));
    }

    @Test
    void isMatch5() {
        assertThat(new Solution().isMatch("mississippi", "mis*is*p*."), equalTo(false));
    }
}
