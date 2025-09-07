package g3601_3700.s3677_count_binary_palindromic_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBinaryPalindromes() {
        assertThat(new Solution().countBinaryPalindromes(9L), equalTo(6));
    }

    @Test
    void countBinaryPalindromes2() {
        assertThat(new Solution().countBinaryPalindromes(9L), equalTo(6));
    }

    @Test
    void countBinaryPalindromes3() {
        // Branch: n == 0 → returns 1 immediately
        assertThat(new Solution().countBinaryPalindromes(0), equalTo(1));
    }

    @Test
    void countBinaryPalindromes4() {
        // n = 1 ("1") → palindrome
        // Expected palindromes: 1 (0) + 1 (1) = 2
        assertThat(new Solution().countBinaryPalindromes(1), equalTo(2));
    }

    @Test
    void countBinaryPalindromes5() {
        // n = 6 ("110"), length = 3 (odd)
        // Palindromes up to 6: 0,1,3,5
        assertThat(new Solution().countBinaryPalindromes(6), equalTo(4));
    }

    @Test
    void countBinaryPalindromes6() {
        // n = 9 ("1001"), palindrome itself
        // Palindromes up to 9: 0,1,3,5,7,9
        assertThat(new Solution().countBinaryPalindromes(9), equalTo(6));
    }

    @Test
    void countBinaryPalindromes7() {
        // n = 10 ("1010") → next palindrome = 9 (smaller) → branch where palin <= n
        // Palindromes up to 10: 0,1,3,5,7,9
        assertThat(new Solution().countBinaryPalindromes(10), equalTo(6));
    }

    @Test
    void countBinaryPalindromes8() {
        // 1023 = "1111111111"
        long n = (1L << 10) - 1;
        assertThat(new Solution().countBinaryPalindromes(n), equalTo(63));
    }
}
