package g1101_1200.s1143_longest_common_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestCommonSubsequence() {
        assertThat(new Solution().longestCommonSubsequence("abcde", "ace"), equalTo(3));
    }

    @Test
    void longestCommonSubsequence2() {
        assertThat(new Solution().longestCommonSubsequence("abc", "abc"), equalTo(3));
    }

    @Test
    void longestCommonSubsequence3() {
        assertThat(new Solution().longestCommonSubsequence("abc", "def"), equalTo(0));
    }
}
