package g3801_3900.s3844_longest_almost_palindromic_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void almostPalindromic() {
        assertThat(new Solution().almostPalindromic("abca"), equalTo(4));
    }

    @Test
    void almostPalindromic2() {
        assertThat(new Solution().almostPalindromic("abba"), equalTo(4));
    }

    @Test
    void almostPalindromic3() {
        assertThat(new Solution().almostPalindromic("zzabba"), equalTo(5));
    }
}
