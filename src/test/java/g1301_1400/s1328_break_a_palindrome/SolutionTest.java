package g1301_1400.s1328_break_a_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void breakPalindrome() {
        assertThat(new Solution().breakPalindrome("abccba"), equalTo("aaccba"));
    }

    @Test
    void breakPalindrome2() {
        assertThat(new Solution().breakPalindrome("a"), equalTo(""));
    }
}
