package g1901_2000.s1930_unique_length_3_palindromic_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPalindromicSubsequence() {
        assertThat(new Solution().countPalindromicSubsequence("aabca"), equalTo(3));
    }

    @Test
    void countPalindromicSubsequence2() {
        assertThat(new Solution().countPalindromicSubsequence("abc"), equalTo(0));
    }

    @Test
    void countPalindromicSubsequence3() {
        assertThat(new Solution().countPalindromicSubsequence("bbcbaba"), equalTo(4));
    }
}
