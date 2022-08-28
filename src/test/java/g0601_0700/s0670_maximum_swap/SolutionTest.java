package g0601_0700.s0670_maximum_swap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSwap() {
        assertThat(new Solution().maximumSwap(2736), equalTo(7236));
    }

    @Test
    void maximumSwap2() {
        assertThat(new Solution().maximumSwap(9973), equalTo(9973));
    }
}
