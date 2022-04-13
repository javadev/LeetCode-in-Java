package g1601_1700.s1616_split_two_strings_to_make_palindrome;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void checkPalindromeFormation() {
        assertThat(new Solution().checkPalindromeFormation("x","y"), equalTo(true));
    }

    @Test
    void checkPalindromeFormation2() {
        assertThat(new Solution().checkPalindromeFormation("xbdef","xbdef"), equalTo(false));
    }

    @Test
    void checkPalindromeFormation3() {
        assertThat(new Solution().checkPalindromeFormation("ulacfd","jizalu"), equalTo(true));
    }
}
