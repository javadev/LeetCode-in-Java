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

    @Test
    void isRationalEqual4() {
        assertThat(new Solution().isRationalEqual("3.14", "3.14"), equalTo(true));
    }

    @Test
    void isRationalEqual5() {
        assertThat(new Solution().isRationalEqual("3.14", "3.15"), equalTo(false));
    }

    @Test
    void isRationalEqual6() {
        // 0.(3) = 0.3333...
        assertThat(new Solution().isRationalEqual("0.(3)", "0.3333333333"), equalTo(false));
    }

    @Test
    void isRationalEqual7() {
        assertThat(new Solution().isRationalEqual("0.(12)", "0.(13)"), equalTo(false));
    }

    @Test
    void isRationalEqual8() {
        // 1.(0) = 1.00000....
        assertThat(new Solution().isRationalEqual("1.(0)", "1."), equalTo(true));
    }

    @Test
    void isRationalEqual9() {
        // large repeating cycle
        assertThat(new Solution().isRationalEqual("0.(987654321)", "0.(987654321)"), equalTo(true));
    }

    @Test
    void isRationalEqual10() {
        assertThat(new Solution().isRationalEqual("42", "42"), equalTo(true));
    }

    @Test
    void isRationalEqual11() {
        assertThat(new Solution().isRationalEqual("42", "42.0"), equalTo(true));
    }

    @Test
    void isRationalEqual12() {
        assertThat(new Solution().isRationalEqual("0.(1)", "0.(2)"), equalTo(false));
    }
}
