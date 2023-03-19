package g0001_0100.s0012_integer_to_roman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void intToRoman() {
        assertThat(new Solution().intToRoman(3), equalTo("III"));
    }

    @Test
    void intToRoman2() {
        assertThat(new Solution().intToRoman(4), equalTo("IV"));
    }

    @Test
    void intToRoman3() {
        assertThat(new Solution().intToRoman(9), equalTo("IX"));
    }

    @Test
    void intToRoman4() {
        assertThat(new Solution().intToRoman(58), equalTo("LVIII"));
    }

    @Test
    void intToRoman5() {
        assertThat(new Solution().intToRoman(1994), equalTo("MCMXCIV"));
    }
}
