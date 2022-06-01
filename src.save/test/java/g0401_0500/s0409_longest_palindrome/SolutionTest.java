package g0401_0500.s0409_longest_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPalindrome() {
        assertThat(new Solution().longestPalindrome("abccccdd"), equalTo(7));
    }

    @Test
    void longestPalindrome2() {
        assertThat(new Solution().longestPalindrome("a"), equalTo(1));
    }

    @Test
    void longestPalindrome3() {
        assertThat(new Solution().longestPalindrome("bb"), equalTo(2));
    }
}
