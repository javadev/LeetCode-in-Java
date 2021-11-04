package g0001_0100.s0008_string_to_integer_atoi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void myAtoi() {
        assertThat(new Solution().myAtoi("42"), equalTo(42));
    }
}
