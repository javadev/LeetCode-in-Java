package g0001_0100.s0003_longest_substring_without_repeating_characters_medium_top_100_liked_questions_top_interview_questions_string_hash_table_sliding_window;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void lengthOfLongestSubstring() {
        assertThat(new Solution().lengthOfLongestSubstring("abcabcbb"), equalTo(3));
    }
}
