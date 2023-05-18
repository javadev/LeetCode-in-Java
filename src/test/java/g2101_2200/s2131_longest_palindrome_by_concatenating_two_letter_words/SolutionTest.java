package g2101_2200.s2131_longest_palindrome_by_concatenating_two_letter_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPalindrome() {
        assertThat(new Solution().longestPalindrome(new String[] {"lc", "cl", "gg"}), equalTo(6));
    }

    @Test
    void longestPalindrome2() {
        assertThat(
                new Solution().longestPalindrome(new String[] {"ab", "ty", "yt", "lc", "cl", "ab"}),
                equalTo(8));
    }

    @Test
    void longestPalindrome3() {
        assertThat(new Solution().longestPalindrome(new String[] {"cc", "ll", "xx"}), equalTo(2));
    }
}
