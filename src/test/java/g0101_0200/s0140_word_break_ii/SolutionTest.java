package g0101_0200.s0140_word_break_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void wordBreak() {
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        assertThat(
                new Solution().wordBreak("catsanddog", wordDict),
                equalTo(Arrays.asList("cat sand dog", "cats and dog")));
    }

    @Test
    void wordBreak2() {
        List<String> wordDict = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        assertThat(
                new Solution().wordBreak("pineapplepenapple", wordDict),
                equalTo(
                        Arrays.asList(
                                "pine apple pen apple",
                                "pine applepen apple",
                                "pineapple pen apple")));
    }

    @Test
    void wordBreak3() {
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertThat(
                new Solution().wordBreak("catsandog", wordDict), equalTo(Collections.emptyList()));
    }
}
