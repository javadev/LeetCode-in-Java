package g0001_0100.s0005_longest_palindromic_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPalindrome() {
        assertThat(new Solution().longestPalindrome("babad"), equalTo("bab"));
    }

    @Test
    void longestPalindrome2() {
        assertThat(new Solution().longestPalindrome("cbbd"), equalTo("bb"));
    }
}
