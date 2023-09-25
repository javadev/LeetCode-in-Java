package g0701_0800.s0770_basic_calculator_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void basicCalculatorIV() {
        assertThat(
                new Solution()
                        .basicCalculatorIV("e + 8 - a + 5", new String[] {"e"}, new int[] {1}),
                equalTo(Arrays.asList("-1*a", "14")));
    }

    @Test
    void basicCalculatorIV2() {
        assertThat(
                new Solution()
                        .basicCalculatorIV(
                                "e - 8 + temperature - pressure",
                                new String[] {"e", "temperature"},
                                new int[] {1, 12}),
                equalTo(Arrays.asList("-1*pressure", "5")));
    }

    @Test
    void basicCalculatorIV3() {
        assertThat(
                new Solution()
                        .basicCalculatorIV("(e + 8) * (e - 8)", new String[] {}, new int[] {}),
                equalTo(Arrays.asList("1*e*e", "-64")));
    }
}
