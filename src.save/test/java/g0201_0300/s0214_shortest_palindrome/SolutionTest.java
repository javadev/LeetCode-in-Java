package g0201_0300.s0214_shortest_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestPalindrome() {
        assertThat(new Solution().shortestPalindrome("aacecaaa"), equalTo("aaacecaaa"));
    }

    @Test
    void shortestPalindrome2() {
        assertThat(new Solution().shortestPalindrome("abcd"), equalTo("dcbabcd"));
    }
}
