package g2001_2100.s2014_longest_subsequence_repeated_k_times;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestSubsequenceRepeatedK() {
        assertThat(new Solution().longestSubsequenceRepeatedK("letsleetcode", 2), equalTo("let"));
    }

    @Test
    void longestSubsequenceRepeatedK2() {
        assertThat(new Solution().longestSubsequenceRepeatedK("bb", 2), equalTo("b"));
    }

    @Test
    void longestSubsequenceRepeatedK3() {
        assertThat(new Solution().longestSubsequenceRepeatedK("ab", 2), equalTo(""));
    }
}
