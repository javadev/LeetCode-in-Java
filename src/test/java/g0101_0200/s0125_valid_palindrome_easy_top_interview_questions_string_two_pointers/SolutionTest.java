package g0101_0200.s0125_valid_palindrome_easy_top_interview_questions_string_two_pointers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isPalindrome() {
        assertThat(new Solution().isPalindrome("A man, a plan, a canal: Panama"), equalTo(true));
    }
}
