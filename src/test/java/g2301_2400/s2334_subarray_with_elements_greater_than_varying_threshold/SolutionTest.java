package g2301_2400.s2334_subarray_with_elements_greater_than_varying_threshold;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validSubarraySize() {
        assertThat(new Solution().validSubarraySize(new int[] {1, 3, 4, 3, 1}, 6), equalTo(3));
    }

    @Test
    void validSubarraySize2() {
        assertThat(new Solution().validSubarraySize(new int[] {6, 5, 6, 5, 8}, 7), equalTo(2));
    }
}
