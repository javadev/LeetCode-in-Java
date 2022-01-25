package g0501_0600.s0557_reverse_words_in_a_string_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseWords() {
        assertThat(
                new Solution().reverseWords("Let's take LeetCode contest"),
                equalTo("s'teL ekat edoCteeL tsetnoc"));
    }

    @Test
    void reverseWords2() {
        assertThat(new Solution().reverseWords("God Ding"), equalTo("doG gniD"));
    }
}
