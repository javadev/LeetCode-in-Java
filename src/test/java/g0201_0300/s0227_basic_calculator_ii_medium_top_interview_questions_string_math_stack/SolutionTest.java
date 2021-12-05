package g0201_0300.s0227_basic_calculator_ii_medium_top_interview_questions_string_math_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void basicCalculatorII() {
        assertThat(new Solution().calculate("3+2*2"), equalTo(7));
    }
}
