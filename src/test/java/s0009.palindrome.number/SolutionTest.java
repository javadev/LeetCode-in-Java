package s0009.palindrome.number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isPalindrome() {
        assertThat(new Solution().isPalindrome(121), equalTo(true));
    }
}
