package g2301_2400.s2396_strictly_palindromic_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isStrictlyPalindromic() {
        assertThat(new Solution().isStrictlyPalindromic(9), equalTo(false));
    }

    @Test
    void isStrictlyPalindromic2() {
        assertThat(new Solution().isStrictlyPalindromic(4), equalTo(false));
    }

    @Test
    void isStrictlyPalindromic3() {
        assertThat(new Solution().isStrictlyPalindromic(9779), equalTo(false));
    }

    @Test
    void isStrictlyPalindromic4() {
        assertThat(new Solution().isStrictlyPalindromic(3), equalTo(true));
    }

    @Test
    void isStrictlyPalindromic5() {
        assertThat(new Solution().isStrictlyPalindromic(2), equalTo(true));
    }

    @Test
    void isStrictlyPalindromic6() {
        assertThat(new Solution().isStrictlyPalindromic(1), equalTo(true));
    }

    @Test
    void isStrictlyPalindromic7() {
        assertThat(new Solution().isStrictlyPalindromic(10000), equalTo(false));
    }
}
