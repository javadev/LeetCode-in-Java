package s0005_longest_palindromic_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestPalindrome() {
        assertThat(new Solution().longestPalindrome("babad"), equalTo("bab"));
    }
}
