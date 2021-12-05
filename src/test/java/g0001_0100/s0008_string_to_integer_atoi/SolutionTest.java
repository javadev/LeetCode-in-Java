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
}
