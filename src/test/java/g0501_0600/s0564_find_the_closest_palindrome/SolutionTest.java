package g0501_0600.s0564_find_the_closest_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nearestPalindromic() {
        assertThat(new Solution().nearestPalindromic("123"), equalTo("121"));
    }

    @Test
    void nearestPalindromic2() {
        assertThat(new Solution().nearestPalindromic("1"), equalTo("0"));
    }
}
