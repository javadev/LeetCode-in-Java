package g0901_1000.s0991_broken_calculator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void brokenCalc() {
        assertThat(new Solution().brokenCalc(2, 3), equalTo(2));
    }

    @Test
    void brokenCalc2() {
        assertThat(new Solution().brokenCalc(5, 8), equalTo(2));
    }

    @Test
    void brokenCalc3() {
        assertThat(new Solution().brokenCalc(3, 10), equalTo(3));
    }
}
