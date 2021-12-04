package g0101_0200.s0166_fraction_to_recurring_decimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void fractionToDecimal() {
        assertThat(new Solution().fractionToDecimal(1, 2), equalTo("0.5"));
    }

    @Test
    public void fractionToDecimal2() {
        assertThat(new Solution().fractionToDecimal(2, 1), equalTo("2"));
    }

    @Test
    public void fractionToDecimal3() {
        assertThat(new Solution().fractionToDecimal(2, 3), equalTo("0.(6)"));
    }

    @Test
    public void fractionToDecimal4() {
        assertThat(new Solution().fractionToDecimal(4, 333), equalTo("0.(012)"));
    }

    @Test
    public void fractionToDecimal5() {
        assertThat(new Solution().fractionToDecimal(1, 5), equalTo("0.2"));
    }
}
