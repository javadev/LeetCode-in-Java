package g0201_0300.s0264_ugly_number_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nthUglyNumber() {
        assertThat(new Solution().nthUglyNumber(10), equalTo(12));
    }

    @Test
    void nthUglyNumber2() {
        assertThat(new Solution().nthUglyNumber(1), equalTo(1));
    }
}
