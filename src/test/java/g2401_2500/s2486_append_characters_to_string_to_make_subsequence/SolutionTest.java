package g2401_2500.s2486_append_characters_to_string_to_make_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void appendCharacters() {
        assertThat(new Solution().appendCharacters("coaching", "coding"), equalTo(4));
    }

    @Test
    void appendCharacters2() {
        assertThat(new Solution().appendCharacters("abcde", "a"), equalTo(0));
    }

    @Test
    void appendCharacters3() {
        assertThat(new Solution().appendCharacters("z", "abcde"), equalTo(5));
    }
}
