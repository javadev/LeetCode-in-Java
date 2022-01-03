package g0501_0600.s0516_longest_palindromic_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPalindromeSubseq() {
        assertThat(new Solution().longestPalindromeSubseq("bbbab"), equalTo(4));
    }

    @Test
    void longestPalindromeSubseq2() {
        assertThat(new Solution().longestPalindromeSubseq("cbbd"), equalTo(2));
    }
}
