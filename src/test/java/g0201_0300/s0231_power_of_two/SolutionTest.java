package g0201_0300.s0231_power_of_two;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isPowerOfTwo() {
        assertThat(new Solution().isPowerOfTwo(1), equalTo(true));
    }

    @Test
    public void isPowerOfTwo2() {
        assertThat(new Solution().isPowerOfTwo(16), equalTo(true));
    }

    @Test
    public void isPowerOfTwo3() {
        assertThat(new Solution().isPowerOfTwo(3), equalTo(false));
    }

    @Test
    public void isPowerOfTwo4() {
        assertThat(new Solution().isPowerOfTwo(4), equalTo(true));
    }

    @Test
    public void isPowerOfTwo5() {
        assertThat(new Solution().isPowerOfTwo(5), equalTo(false));
    }
}
