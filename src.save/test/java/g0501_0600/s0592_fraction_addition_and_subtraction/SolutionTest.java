package g0501_0600.s0592_fraction_addition_and_subtraction;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fractionAddition() {
        assertThat(new Solution().fractionAddition("-1/2+1/2"), equalTo("0/1"));
    }

    @Test
    void fractionAddition2() {
        assertThat(new Solution().fractionAddition("-1/2+1/2+1/3"), equalTo("1/3"));
    }

    @Test
    void fractionAddition3() {
        assertThat(new Solution().fractionAddition("1/3-1/2"), equalTo("-1/6"));
    }
}
