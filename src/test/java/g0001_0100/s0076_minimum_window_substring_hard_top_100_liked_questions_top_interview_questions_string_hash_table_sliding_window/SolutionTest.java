package g0001_0100.s0076_minimum_window_substring_hard_top_100_liked_questions_top_interview_questions_string_hash_table_sliding_window;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void minWindow() {
        assertThat(new Solution().minWindow("ADOBECODEBANC", "ABC"), equalTo("BANC"));
    }
}
