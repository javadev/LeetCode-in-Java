package g3601_3700.s3646_next_special_palindrome_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void specialPalindrome() {
        assertThat(new Solution().specialPalindrome(2L), equalTo(22L));
    }

    @Test
    void specialPalindrome2() {
        assertThat(new Solution().specialPalindrome(33L), equalTo(212L));
    }
}
