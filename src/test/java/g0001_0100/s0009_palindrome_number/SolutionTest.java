package g0001_0100.s0009_palindrome_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void isPalindrome() {
        assertThat(new Solution().isPalindrome(121), equalTo(true));
    }
}
