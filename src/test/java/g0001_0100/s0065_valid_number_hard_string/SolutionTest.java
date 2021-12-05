package g0001_0100.s0065_valid_number_hard_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isNumber() {
        Solution solution = new Solution();
        assertThat(solution.isNumber("0"), equalTo(true));
        assertThat(solution.isNumber("e"), equalTo(false));
        assertThat(solution.isNumber("."), equalTo(false));
        assertThat(solution.isNumber(".1"), equalTo(true));
        assertThat(solution.isNumber("+.1"), equalTo(true));
        assertThat(solution.isNumber("-.1"), equalTo(true));
        assertThat(solution.isNumber("++.1"), equalTo(false));
        assertThat(solution.isNumber("1e1"), equalTo(true));
        assertThat(solution.isNumber("1E1"), equalTo(true));
        assertThat(solution.isNumber("1.1E1"), equalTo(true));
    }
}
