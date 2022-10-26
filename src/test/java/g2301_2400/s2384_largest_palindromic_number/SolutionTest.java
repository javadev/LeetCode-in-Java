package g2301_2400.s2384_largest_palindromic_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestPalindromic() {
        assertThat(new Solution().largestPalindromic("444947137"), equalTo("7449447"));
    }

    @Test
    void largestPalindromic2() {
        assertThat(new Solution().largestPalindromic("00009"), equalTo("9"));
    }
}
