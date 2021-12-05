package g0201_0300.s0224_basic_calculator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void calculate() {
        assertThat(new Solution().calculate("1 + 1"), equalTo(2));
    }

    @Test
    void calculate2() {
        assertThat(new Solution().calculate(" 2-1 + 2 "), equalTo(3));
    }

    @Test
    void calculate3() {
        assertThat(new Solution().calculate("(1+(4+5+2)-3)+(6+8)"), equalTo(23));
    }
}
