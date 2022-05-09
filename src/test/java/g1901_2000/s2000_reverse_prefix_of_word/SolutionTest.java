package g1901_2000.s2000_reverse_prefix_of_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reversePrefix() {
        assertThat(new Solution().reversePrefix("abcdefd", 'd'), equalTo("dcbaefd"));
    }

    @Test
    void reversePrefix2() {
        assertThat(new Solution().reversePrefix("xyxzxe", 'z'), equalTo("zxyxxe"));
    }

    @Test
    void reversePrefix3() {
        assertThat(new Solution().reversePrefix("abcd", 'z'), equalTo("abcd"));
    }
}
