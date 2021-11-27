package g0201_0300.s0224_basic_calculator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void calculate() {
        assertThat(new Solution().calculate("1 + 1"), equalTo(2));
    }
}
