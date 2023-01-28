package g2001_2100.s2085_count_common_words_with_one_occurrence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countWords() {
        assertThat(
                new Solution()
                        .countWords(
                                new String[] {"leetcode", "is", "amazing", "as", "is"},
                                new String[] {"amazing", "leetcode", "is"}),
                equalTo(2));
    }

    @Test
    void countWords2() {
        assertThat(
                new Solution()
                        .countWords(
                                new String[] {"b", "bb", "bbb"}, new String[] {"a", "aa", "aaa"}),
                equalTo(0));
    }

    @Test
    void countWords3() {
        assertThat(
                new Solution()
                        .countWords(new String[] {"a", "ab"}, new String[] {"a", "a", "a", "ab"}),
                equalTo(1));
    }
}
