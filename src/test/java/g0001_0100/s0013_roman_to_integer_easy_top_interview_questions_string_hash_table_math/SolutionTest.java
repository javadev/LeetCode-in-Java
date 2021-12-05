package g0001_0100.s0013_roman_to_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void romanToInt() {
        Solution solution = new Solution();
        assertThat(solution.romanToInt("III"), equalTo(3));
        assertThat(solution.romanToInt("IV"), equalTo(4));
        assertThat(solution.romanToInt("IX"), equalTo(9));
        assertThat(solution.romanToInt("LVIII"), equalTo(58));
        assertThat(solution.romanToInt("MCMXCIV"), equalTo(1994));
    }
}
