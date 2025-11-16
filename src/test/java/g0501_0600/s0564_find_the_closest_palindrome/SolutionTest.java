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

    @Test
    void nearestPalindromic3() {
        assertThat(new Solution().nearestPalindromic("121"), equalTo("111"));
    }

    @Test
    void nearestPalindromic4() {
        assertThat(new Solution().nearestPalindromic("100"), equalTo("99"));
    }

    @Test
    void nearestPalindromic5() {
        assertThat(new Solution().nearestPalindromic("2"), equalTo("1"));
    }

    @Test
    void nearestPalindromic6() {
        assertThat(new Solution().nearestPalindromic("999"), equalTo("1001"));
    }

    @Test
    void nearestPalindromic7() {
        assertThat(new Solution().nearestPalindromic("1221"), equalTo("1111"));
    }

    @Test
    void nearestPalindromic8() {
        assertThat(new Solution().nearestPalindromic("12321"), equalTo("12221"));
    }

    @Test
    void nearestPalindromic9() {
        assertThat(new Solution().nearestPalindromic("1000001"), equalTo("999999"));
    }

    @Test
    void nearestPalindromic10() {
        assertThat(new Solution().nearestPalindromic("10"), equalTo("9"));
    }

    @Test
    void nearestPalindromic11() {
        assertThat(new Solution().nearestPalindromic("11"), equalTo("9"));
    }

    @Test
    void nearestPalindromic12() {
        assertThat(new Solution().nearestPalindromic("807"), equalTo("808"));
    }

    @Test
    void nearestPalindromic13() {
        assertThat(new Solution().nearestPalindromic("1000"), equalTo("999"));
    }
}
