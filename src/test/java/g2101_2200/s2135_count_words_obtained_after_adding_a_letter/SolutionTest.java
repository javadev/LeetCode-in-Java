package g2101_2200.s2135_count_words_obtained_after_adding_a_letter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void wordCount() {
        assertThat(
                new Solution()
                        .wordCount(
                                new String[] {"ant", "act", "tack"},
                                new String[] {"tack", "act", "acti"}),
                equalTo(2));
    }

    @Test
    void wordCount2() {
        assertThat(
                new Solution().wordCount(new String[] {"ab", "a"}, new String[] {"abc", "abcd"}),
                equalTo(1));
    }
}
