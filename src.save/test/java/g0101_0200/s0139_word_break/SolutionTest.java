package g0101_0200.s0139_word_break;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void wordBreak() {
        assertThat(
                new Solution().wordBreak("leetcode", Arrays.asList("leet", "code")), equalTo(true));
    }

    @Test
    void wordBreak2() {
        assertThat(
                new Solution().wordBreak("applepenapple", Arrays.asList("apple", "pen")),
                equalTo(true));
    }

    @Test
    void wordBreak3() {
        assertThat(
                new Solution()
                        .wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")),
                equalTo(false));
    }
}
