package g0201_0300.s0227_basic_calculator_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void basicCalculatorII() {
        assertThat(new Solution().calculate("3+2*2"), equalTo(7));
    }

    @Test
    void basicCalculatorII2() {
        assertThat(new Solution().calculate(" 3/2 "), equalTo(1));
    }

    @Test
    void basicCalculatorII3() {
        assertThat(new Solution().calculate(" 3+5 / 2 "), equalTo(5));
    }
}
