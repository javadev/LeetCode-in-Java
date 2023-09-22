package g2701_2800.s2730_find_the_longest_semi_repetitive_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSemiRepetitiveSubstring() {
        assertThat(new Solution().longestSemiRepetitiveSubstring("52233"), equalTo(4));
    }

    @Test
    void longestSemiRepetitiveSubstring2() {
        assertThat(new Solution().longestSemiRepetitiveSubstring("5494"), equalTo(4));
    }

    @Test
    void longestSemiRepetitiveSubstring3() {
        assertThat(new Solution().longestSemiRepetitiveSubstring("1111111"), equalTo(2));
    }
}
