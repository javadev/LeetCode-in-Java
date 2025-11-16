package g0001_0100.s0008_string_to_integer_atoi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void myAtoi() {
        assertThat(new Solution().myAtoi("42"), equalTo(42));
    }

    @Test
    void myAtoi2() {
        assertThat(new Solution().myAtoi("   -42"), equalTo(-42));
    }

    @Test
    void myAtoi3() {
        assertThat(new Solution().myAtoi("4193 with words"), equalTo(4193));
    }

    @Test
    void myAtoi4() {
        assertThat(new Solution().myAtoi("words and 987"), equalTo(0));
    }

    @Test
    void myAtoi5() {
        assertThat(new Solution().myAtoi("-91283472332"), equalTo(-2147483648));
    }

    @Test
    void myAtoi6() {
        assertThat(new Solution().myAtoi("123"), equalTo(123));
    }

    @Test
    void myAtoi7() {
        assertThat(new Solution().myAtoi("+456"), equalTo(456));
    }

    @Test
    void myAtoi8() {
        assertThat(new Solution().myAtoi("0000123"), equalTo(123));
    }

    @Test
    void myAtoi9() {
        assertThat(new Solution().myAtoi("2147483648"), equalTo(Integer.MAX_VALUE));
    }

    @Test
    void myAtoi10() {
        assertThat(new Solution().myAtoi("-2147483649"), equalTo(Integer.MIN_VALUE));
    }

    @Test
    void myAtoi11() {
        assertThat(new Solution().myAtoi(""), equalTo(0));
    }

    @Test
    void myAtoi12() {
        assertThat(new Solution().myAtoi("     "), equalTo(0));
    }

    @Test
    void myAtoi13() {
        assertThat(new Solution().myAtoi("+-2"), equalTo(0));
    }

    @Test
    void myAtoi14() {
        assertThat(new Solution().myAtoi("0"), equalTo(0));
    }

    @Test
    void myAtoi15() {
        assertThat(new Solution().myAtoi("-0"), equalTo(0));
    }

    @Test
    void myAtoi16() {
        assertThat(new Solution().myAtoi("words 123"), equalTo(0));
    }

    @Test
    void myAtoi17() {
        assertThat(new Solution().myAtoi("  0000000000012345678abc"), equalTo(12345678));
    }
}
