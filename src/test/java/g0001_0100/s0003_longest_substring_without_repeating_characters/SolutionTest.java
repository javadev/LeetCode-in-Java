package g0001_0100.s0003_longest_substring_without_repeating_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void lengthOfLongestSubstring() {
        assertThat(new Solution().lengthOfLongestSubstring("abcabcbb"), equalTo(3));
    }
}
