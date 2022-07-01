package g0001_0100.s0076_minimum_window_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minWindow() {
        assertThat(new Solution().minWindow("ADOBECODEBANC", "ABC"), equalTo("BANC"));
    }

    @Test
    void minWindow2() {
        assertThat(new Solution().minWindow("a", "a"), equalTo("a"));
    }

    @Test
    void minWindow3() {
        assertThat(new Solution().minWindow("a", "aa"), equalTo(""));
    }
}
