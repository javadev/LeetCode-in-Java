package g0301_0400.s0342_power_of_four;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPowerOfFour() {
        assertThat(new Solution().isPowerOfFour(16), equalTo(true));
    }

    @Test
    void isPowerOfFour2() {
        assertThat(new Solution().isPowerOfFour(5), equalTo(false));
    }

    @Test
    void isPowerOfFour3() {
        assertThat(new Solution().isPowerOfFour(1), equalTo(true));
    }
}
