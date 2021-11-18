package g0101_0200.s0166_fraction_to_recurring_decimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void fractionToDecimal() {
        assertThat(new Solution().fractionToDecimal(1, 2), equalTo("0.5"));
    }
}
