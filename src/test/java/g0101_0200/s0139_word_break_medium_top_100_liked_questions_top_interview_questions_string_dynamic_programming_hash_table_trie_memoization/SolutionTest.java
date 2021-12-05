package g0101_0200.s0139_word_break_medium_top_100_liked_questions_top_interview_questions_string_dynamic_programming_hash_table_trie_memoization;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void wordBreak() {
        assertThat(
                new Solution().wordBreak("leetcode", Arrays.asList("leet", "code")), equalTo(true));
        assertThat(
                new Solution().wordBreak("applepenapple", Arrays.asList("apple", "pen")),
                equalTo(true));
        assertThat(
                new Solution()
                        .wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")),
                equalTo(false));
    }
}
