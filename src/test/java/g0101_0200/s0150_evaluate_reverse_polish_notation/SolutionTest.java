package g0101_0200.s0150_evaluate_reverse_polish_notation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void evalRPN() {
        assertThat(new Solution().evalRPN(new String[] {"2", "1", "+", "3", "*"}), equalTo(9));
    }
}
