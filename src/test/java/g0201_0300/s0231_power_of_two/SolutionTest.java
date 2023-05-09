package g0201_0300.s0231_power_of_two;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPowerOfTwo() {
        assertThat(new Solution().isPowerOfTwo(1), equalTo(true));
    }

    @Test
    void isPowerOfTwo2() {
        assertThat(new Solution().isPowerOfTwo(16), equalTo(true));
    }

    @Test
    void isPowerOfTwo3() {
        assertThat(new Solution().isPowerOfTwo(3), equalTo(false));
    }

    @Test
    void isPowerOfTwo4() {
        assertThat(new Solution().isPowerOfTwo(4), equalTo(true));
    }

    @Test
    void isPowerOfTwo5() {
        assertThat(new Solution().isPowerOfTwo(5), equalTo(false));
    }
}
