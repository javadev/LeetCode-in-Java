package g0001_0100.s0003_longest_substring_without_repeating_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lengthOfLongestSubstring() {
        assertThat(new Solution().lengthOfLongestSubstring("abcabcbb"), equalTo(3));
    }

    @Test
    void lengthOfLongestSubstring2() {
        assertThat(new Solution().lengthOfLongestSubstring("bbbbb"), equalTo(1));
    }

    @Test
    void lengthOfLongestSubstring3() {
        assertThat(new Solution().lengthOfLongestSubstring("pwwkew"), equalTo(3));
    }
}
