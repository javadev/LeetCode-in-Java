package g0401_0500.s0413_arithmetic_slices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfArithmeticSlices() {
        assertThat(new Solution().numberOfArithmeticSlices(new int[] {1, 2, 3, 4}), equalTo(3));
    }

    @Test
    void numberOfArithmeticSlices2() {
        assertThat(new Solution().numberOfArithmeticSlices(new int[] {1}), equalTo(0));
    }
}
