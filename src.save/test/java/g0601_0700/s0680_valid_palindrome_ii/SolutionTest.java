package g0601_0700.s0680_valid_palindrome_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validPalindrome() {
        assertThat(new Solution().validPalindrome("aba"), equalTo(true));
    }

    @Test
    void validPalindrome2() {
        assertThat(new Solution().validPalindrome("abca"), equalTo(true));
    }

    @Test
    void validPalindrome3() {
        assertThat(new Solution().validPalindrome("abc"), equalTo(false));
    }
}
