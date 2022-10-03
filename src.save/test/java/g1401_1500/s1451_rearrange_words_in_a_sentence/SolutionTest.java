package g1401_1500.s1451_rearrange_words_in_a_sentence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void arrangeWords() {
        assertThat(new Solution().arrangeWords("Leetcode is cool"), equalTo("Is cool leetcode"));
    }

    @Test
    void arrangeWords2() {
        assertThat(
                new Solution().arrangeWords("Keep calm and code on"),
                equalTo("On and keep calm code"));
    }

    @Test
    void arrangeWords3() {
        assertThat(
                new Solution().arrangeWords("To be or not to be"), equalTo("To be or to be not"));
    }
}
