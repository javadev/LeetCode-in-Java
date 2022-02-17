package g0901_1000.s0962_maximum_width_ramp;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxWidthRamp() {
        assertThat(new Solution().maxWidthRamp(new int[] {6, 0, 8, 2, 1, 5}), equalTo(4));
    }

    @Test
    void maxWidthRamp2() {
        assertThat(
                new Solution().maxWidthRamp(new int[] {9, 8, 1, 0, 1, 9, 4, 0, 4, 1}), equalTo(7));
    }
}
