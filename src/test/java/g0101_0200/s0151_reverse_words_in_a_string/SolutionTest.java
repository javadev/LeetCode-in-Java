package g0101_0200.s0151_reverse_words_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void reverseWords() {
        assertThat(new Solution().reverseWords("the sky is blue"), equalTo("blue is sky the"));
    }
}
