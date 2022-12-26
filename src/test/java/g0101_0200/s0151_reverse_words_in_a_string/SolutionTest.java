package g0101_0200.s0151_reverse_words_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseWords() {
        assertThat(new Solution().reverseWords("the sky is blue"), equalTo("blue is sky the"));
    }

    @Test
    void reverseWords2() {
        assertThat(new Solution().reverseWords("  hello world  "), equalTo("world hello"));
    }

    @Test
    void reverseWords3() {
        assertThat(new Solution().reverseWords("a good   example"), equalTo("example good a"));
    }
}
