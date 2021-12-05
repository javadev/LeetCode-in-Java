package g0001_0100.s0028_implement_strstr_easy_top_interview_questions_string_two_pointers_string_matching;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void strStr() {
        assertThat(new Solution().strStr("hello", "ll"), equalTo(2));
    }
}
