package g0901_1000.s0972_equal_rational_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isRationalEqual() {
        assertThat(new Solution().isRationalEqual("0.(52)", "0.5(25)"), equalTo(true));
    }

    @Test
    void isRationalEqual2() {
        assertThat(new Solution().isRationalEqual("0.1666(6)", "0.166(66)"), equalTo(true));
    }

    @Test
    void isRationalEqual3() {
        assertThat(new Solution().isRationalEqual("0.9(9)", "1."), equalTo(true));
    }
}
