package g3701_3800.s3734_lexicographically_smallest_palindromic_permutation_greater_than_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lexPalindromicPermutation() {
        assertThat(new Solution().lexPalindromicPermutation("baba", "abba"), equalTo("baab"));
    }

    @Test
    void lexPalindromicPermutation2() {
        assertThat(new Solution().lexPalindromicPermutation("baba", "bbaa"), equalTo(""));
    }

    @Test
    void lexPalindromicPermutation3() {
        assertThat(new Solution().lexPalindromicPermutation("abc", "abb"), equalTo(""));
    }

    @Test
    void lexPalindromicPermutation4() {
        assertThat(new Solution().lexPalindromicPermutation("aac", "abb"), equalTo("aca"));
    }
}
