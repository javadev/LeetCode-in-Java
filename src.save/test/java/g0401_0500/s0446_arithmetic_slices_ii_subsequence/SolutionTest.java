package g0401_0500.s0446_arithmetic_slices_ii_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfArithmeticSlices() {
        assertThat(new Solution().numberOfArithmeticSlices(new int[] {2, 4, 6, 8, 10}), equalTo(7));
    }

    @Test
    void numberOfArithmeticSlices2() {
        assertThat(new Solution().numberOfArithmeticSlices(new int[] {7, 7, 7, 7, 7}), equalTo(16));
    }
}
