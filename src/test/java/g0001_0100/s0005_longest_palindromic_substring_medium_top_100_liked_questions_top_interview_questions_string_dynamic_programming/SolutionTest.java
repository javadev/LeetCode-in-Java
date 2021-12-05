package g0001_0100.s0005_longest_palindromic_substring_medium_top_100_liked_questions_top_interview_questions_string_dynamic_programming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestPalindrome() {
        assertThat(new Solution().longestPalindrome("babad"), equalTo("bab"));
    }
}
