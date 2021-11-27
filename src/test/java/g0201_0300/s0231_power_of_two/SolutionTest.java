package g0201_0300.s0231_power_of_two;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isPowerOfTwo() {
        assertThat(new Solution().isPowerOfTwo(1), equalTo(true));
    }
}
