package g0901_1000.s0978_longest_turbulent_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTurbulenceSize() {
        assertThat(
                new Solution().maxTurbulenceSize(new int[] {9, 4, 2, 10, 7, 8, 8, 1, 9}),
                equalTo(5));
    }

    @Test
    void maxTurbulenceSize2() {
        assertThat(new Solution().maxTurbulenceSize(new int[] {4, 8, 12, 16}), equalTo(2));
    }

    @Test
    void maxTurbulenceSize3() {
        assertThat(new Solution().maxTurbulenceSize(new int[] {100}), equalTo(1));
    }
}
