package g1001_1100.s1003_check_if_word_is_valid_after_substitutions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isValid() {
        assertThat(new Solution().isValid("aabcbc"), equalTo(true));
    }

    @Test
    void isValid2() {
        assertThat(new Solution().isValid("abcabcababcc"), equalTo(true));
    }

    @Test
    void isValid3() {
        assertThat(new Solution().isValid("abccba"), equalTo(false));
    }
}
