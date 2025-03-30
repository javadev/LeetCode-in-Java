package g3501_3600.s3504_longest_palindrome_after_substring_concatenation_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPalindrome() {
        assertThat(new Solution().longestPalindrome("a", "a"), equalTo(2));
    }

    @Test
    void longestPalindrome2() {
        assertThat(new Solution().longestPalindrome("abc", "def"), equalTo(1));
    }

    @Test
    void longestPalindrome3() {
        assertThat(new Solution().longestPalindrome("b", "aaaa"), equalTo(4));
    }

    @Test
    void longestPalindrome4() {
        assertThat(new Solution().longestPalindrome("abcde", "ecdba"), equalTo(5));
    }
}
