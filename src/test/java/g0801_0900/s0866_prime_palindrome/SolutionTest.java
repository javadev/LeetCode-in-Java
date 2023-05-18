package g0801_0900.s0866_prime_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void primePalindrome() {
        assertThat(new Solution().primePalindrome(6), equalTo(7));
    }

    @Test
    void primePalindrome2() {
        assertThat(new Solution().primePalindrome(8), equalTo(11));
    }

    @Test
    void primePalindrome3() {
        assertThat(new Solution().primePalindrome(13), equalTo(101));
    }
}
