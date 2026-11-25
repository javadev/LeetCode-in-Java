package g4001_4100.s4030_check_ascii_palindromic;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPalindromic() {
        assertThat(new Solution().isPalindromic("A"), equalTo(false));
    }

    @Test
    void isPalindromic2() {
        assertThat(new Solution().isPalindromic("\u0000"), equalTo(true));
    }

    @Test
    void isPalindromic3() {
        assertThat(new Solution().isPalindromic("\u0001\u0080"), equalTo(true));
    }

    @Test
    void isPalindromic4() {
        assertThat(new Solution().isPalindromic("ab"), equalTo(false));
    }
}
