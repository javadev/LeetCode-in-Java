package g2601_2700.s2697_lexicographically_smallest_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeSmallestPalindrome() {
        assertThat(new Solution().makeSmallestPalindrome("egcfe"), equalTo("efcfe"));
    }

    @Test
    void makeSmallestPalindrome2() {
        assertThat(new Solution().makeSmallestPalindrome("abcd"), equalTo("abba"));
    }

    @Test
    void makeSmallestPalindrome3() {
        assertThat(new Solution().makeSmallestPalindrome("seven"), equalTo("neven"));
    }
}
