package g0801_0900.s0820_short_encoding_of_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumLengthEncoding() {
        assertThat(
                new Solution().minimumLengthEncoding(new String[] {"time", "me", "bell"}),
                equalTo(10));
    }

    @Test
    void minimumLengthEncoding2() {
        assertThat(new Solution().minimumLengthEncoding(new String[] {"t"}), equalTo(2));
    }
}
