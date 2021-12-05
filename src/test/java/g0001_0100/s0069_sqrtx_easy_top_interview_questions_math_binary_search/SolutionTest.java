package g0001_0100.s0069_sqrtx_easy_top_interview_questions_math_binary_search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void mySqrt() {
        assertThat(new Solution().mySqrt(4), equalTo(2));
    }

    @Test
    public void mySqrt2() {
        assertThat(new Solution().mySqrt(8), equalTo(2));
    }
}
