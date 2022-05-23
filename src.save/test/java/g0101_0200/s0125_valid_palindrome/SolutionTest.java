package g0101_0200.s0125_valid_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPalindrome() {
        assertThat(new Solution().isPalindrome("A man, a plan, a canal: Panama"), equalTo(true));
    }

    @Test
    void isPalindrome2() {
        assertThat(new Solution().isPalindrome("race a car"), equalTo(false));
    }

    @Test
    void isPalindrome3() {
        assertThat(new Solution().isPalindrome(" "), equalTo(true));
    }
}
