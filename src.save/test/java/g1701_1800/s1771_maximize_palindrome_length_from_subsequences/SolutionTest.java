package g1701_1800.s1771_maximize_palindrome_length_from_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPalindrome() {
        assertThat(new Solution().longestPalindrome("cacb", "cbba"), equalTo(5));
    }

    @Test
    void longestPalindrome2() {
        assertThat(new Solution().longestPalindrome("ab", "ab"), equalTo(3));
    }

    @Test
    void longestPalindrome3() {
        assertThat(new Solution().longestPalindrome("aa", "bb"), equalTo(0));
    }
}
