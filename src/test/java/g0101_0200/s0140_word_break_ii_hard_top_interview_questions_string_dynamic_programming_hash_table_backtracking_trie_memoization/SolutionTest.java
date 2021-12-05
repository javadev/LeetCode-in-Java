package g0101_0200.s0140_word_break_ii_hard_top_interview_questions_string_dynamic_programming_hash_table_backtracking_trie_memoization;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void wordBreak() {
        assertThat(
                new Solution()
                        .wordBreak(
                                "catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")),
                equalTo(Arrays.asList("cat sand dog", "cats and dog")));
    }
}
