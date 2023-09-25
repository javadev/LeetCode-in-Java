package g1301_1400.s1388_pizza_with_3n_slices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSizeSlices() {
        assertThat(new Solution().maxSizeSlices(new int[] {1, 2, 3, 4, 5, 6}), equalTo(10));
    }

    @Test
    void maxSizeSlices2() {
        assertThat(new Solution().maxSizeSlices(new int[] {8, 9, 8, 6, 1, 1}), equalTo(16));
    }
}
