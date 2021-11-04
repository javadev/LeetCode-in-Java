package g0001_0100.s0012_integer_to_roman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void intToRoman() {
        Solution solution = new Solution();
        assertThat(solution.intToRoman(3), equalTo("III"));
        assertThat(solution.intToRoman(4), equalTo("IV"));
        assertThat(solution.intToRoman(9), equalTo("IX"));
        assertThat(solution.intToRoman(58), equalTo("LVIII"));
        assertThat(solution.intToRoman(1994), equalTo("MCMXCIV"));
    }
}
