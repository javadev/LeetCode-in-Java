package g0301_0400.s0326_power_of_three;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPowerOfThree() {
        assertThat(new Solution().isPowerOfThree(27), equalTo(true));
    }

    @Test
    void isPowerOfThree2() {
        assertThat(new Solution().isPowerOfThree(0), equalTo(false));
    }

    @Test
    void isPowerOfThree3() {
        assertThat(new Solution().isPowerOfThree(9), equalTo(true));
    }
}
