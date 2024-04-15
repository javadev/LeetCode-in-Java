package g0001_0100.s0013_roman_to_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void romanToInt() {
        assertThat(new Solution().romanToInt("III"), equalTo(3));
    }

    @Test
    void romanToInt2() {
        assertThat(new Solution().romanToInt("IV"), equalTo(4));
    }

    @Test
    void romanToInt3() {
        assertThat(new Solution().romanToInt("IX"), equalTo(9));
    }

    @Test
    void romanToInt4() {
        assertThat(new Solution().romanToInt("LVIII"), equalTo(58));
    }

    @Test
    void romanToInt5() {
        assertThat(new Solution().romanToInt("MCMXCIV"), equalTo(1994));
    }
}
