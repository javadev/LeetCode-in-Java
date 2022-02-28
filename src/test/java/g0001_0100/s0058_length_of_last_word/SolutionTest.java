package g0001_0100.s0058_length_of_last_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lengthOfLastWord() {
        assertThat(new Solution().lengthOfLastWord("Hello World"), equalTo(5));
    }
}
