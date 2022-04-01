package g0801_0900.s0884_uncommon_words_from_two_sentences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uncommonFromSentences() {
        assertThat(
                new Solution().uncommonFromSentences("this apple is sweet", "this apple is sour"),
                equalTo(new String[] {"sweet", "sour"}));
    }

    @Test
    void uncommonFromSentences2() {
        assertThat(
                new Solution().uncommonFromSentences("apple apple", "banana"),
                equalTo(new String[] {"banana"}));
    }
}
