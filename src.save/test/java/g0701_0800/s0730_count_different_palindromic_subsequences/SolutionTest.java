package g0701_0800.s0730_count_different_palindromic_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPalindromicSubsequences() {
        assertThat(new Solution().countPalindromicSubsequences("bccb"), equalTo(6));
    }

    @Test
    void countPalindromicSubsequences2() {
        assertThat(
                new Solution()
                        .countPalindromicSubsequences(
                                "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"),
                equalTo(104860361));
    }
}
