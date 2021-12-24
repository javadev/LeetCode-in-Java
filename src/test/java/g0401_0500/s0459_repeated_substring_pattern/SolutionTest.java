package g0401_0500.s0459_repeated_substring_pattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void repeatedSubstringPattern() {
        assertThat(new Solution().repeatedSubstringPattern("abab"), equalTo(true));
    }

    @Test
    void repeatedSubstringPattern2() {
        assertThat(new Solution().repeatedSubstringPattern("aba"), equalTo(false));
    }

    @Test
    void repeatedSubstringPattern3() {
        assertThat(new Solution().repeatedSubstringPattern("abcabcabcabc"), equalTo(true));
    }
}
