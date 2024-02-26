package g1701_1800.s1763_longest_nice_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestNiceSubstring() {
        assertThat(new Solution().longestNiceSubstring("YazaAay"), equalTo("aAa"));
    }

    @Test
    void longestNiceSubstring2() {
        assertThat(new Solution().longestNiceSubstring("Bb"), equalTo("Bb"));
    }

    @Test
    void longestNiceSubstring3() {
        assertThat(new Solution().longestNiceSubstring("c"), equalTo(""));
    }
}
