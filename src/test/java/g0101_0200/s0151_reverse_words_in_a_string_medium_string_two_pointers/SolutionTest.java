package g0101_0200.s0151_reverse_words_in_a_string_medium_string_two_pointers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void reverseWords() {
        assertThat(new Solution().reverseWords("the sky is blue"), equalTo("blue is sky the"));
    }
}
