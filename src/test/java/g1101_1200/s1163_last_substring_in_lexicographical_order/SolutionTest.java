package g1101_1200.s1163_last_substring_in_lexicographical_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lastSubstring() {
        assertThat(new Solution().lastSubstring("abab"), equalTo("bab"));
    }

    @Test
    void lastSubstring2() {
        assertThat(new Solution().lastSubstring("leetcode"), equalTo("tcode"));
    }
}
