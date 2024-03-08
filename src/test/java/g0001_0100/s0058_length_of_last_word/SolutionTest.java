package g0001_0100.s0058_length_of_last_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lengthOfLastWord() {
        assertThat(new Solution().lengthOfLastWord("Hello World"), equalTo(5));
    }

    @Test
    void lengthOfLastWord2() {
        assertThat(new Solution().lengthOfLastWord("   fly me   to   the moon  "), equalTo(4));
    }

    @Test
    void lengthOfLastWord3() {
        assertThat(new Solution().lengthOfLastWord("luffy is still joyboy"), equalTo(6));
    }
}
