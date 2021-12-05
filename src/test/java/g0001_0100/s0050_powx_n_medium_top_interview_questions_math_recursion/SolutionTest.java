package g0001_0100.s0050_powx_n_medium_top_interview_questions_math_recursion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void myPow() {
        assertThat(new Solution().myPow(2.00000, 10), equalTo(1024.00000));
    }
}
