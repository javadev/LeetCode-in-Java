package s0008.string.to.integer.atoi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void myAtoi() {
        assertThat(new Solution().myAtoi("42"), equalTo(42));
    }
}
