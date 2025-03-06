package g3401_3500.s3472_longest_palindromic_subsequence_after_at_most_k_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestPalindromicSubsequence() {
        assertThat(new Solution().longestPalindromicSubsequence("abced", 2), equalTo(3));
    }

    @Test
    void longestPalindromicSubsequence2() {
        assertThat(new Solution().longestPalindromicSubsequence("aaazzz", 4), equalTo(6));
    }
}
