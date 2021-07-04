package s0005.longest.palindromic.substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestPalindrome() {
        assertThat(new Solution().longestPalindrome("babad"), equalTo("bab"));
    }
}
