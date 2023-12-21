package g2001_2100.s2047_number_of_valid_words_in_a_sentence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countValidWords() {
        assertThat(new Solution().countValidWords("cat and  dog"), equalTo(3));
    }

    @Test
    void countValidWords2() {
        assertThat(new Solution().countValidWords("!this  1-s b8d!"), equalTo(0));
    }

    @Test
    void countValidWords3() {
        assertThat(
                new Solution().countValidWords("alice and  bob are playing stone-game10"),
                equalTo(5));
    }
}
