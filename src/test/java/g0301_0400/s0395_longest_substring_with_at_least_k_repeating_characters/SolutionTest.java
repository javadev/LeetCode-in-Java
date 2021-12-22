package g0301_0400.s0395_longest_substring_with_at_least_k_repeating_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubstring() {
        assertThat(new Solution().longestSubstring("aaabb", 3), equalTo(3));
    }

    @Test
    void longestSubstring2() {
        assertThat(new Solution().longestSubstring("ababbc", 2), equalTo(5));
    }
}
