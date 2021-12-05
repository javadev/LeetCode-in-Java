package g0201_0300.s0233_number_of_digit_one_hard_dynamic_programming_math_recursion;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void countDigitOne() {
        assertThat(new Solution().countDigitOne(13), equalTo(6));
    }

    @Test
    public void countDigitOne2() {
        assertThat(new Solution().countDigitOne(0), equalTo(0));
    }
}
