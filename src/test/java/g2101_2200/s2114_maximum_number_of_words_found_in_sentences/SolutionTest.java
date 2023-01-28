package g2101_2200.s2114_maximum_number_of_words_found_in_sentences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostWordsFound() {
        assertThat(
                new Solution()
                        .mostWordsFound(
                                new String[] {
                                    "alice and bob love leetcode",
                                    "i think so too",
                                    "this is great thanks very much"
                                }),
                equalTo(6));
    }

    @Test
    void mostWordsFound2() {
        assertThat(
                new Solution()
                        .mostWordsFound(
                                new String[] {
                                    "please wait", "continue to fight", "continue to win"
                                }),
                equalTo(3));
    }
}
