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
}
