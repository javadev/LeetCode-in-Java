package g0001_0100.s0053_maximum_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubArray() {
        assertThat(
                new Solution().maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}), equalTo(6));
    }

    @Test
    void maxSubArray2() {
        assertThat(new Solution().maxSubArray(new int[] {1}), equalTo(1));
    }

    @Test
    void maxSubArray3() {
        assertThat(new Solution().maxSubArray(new int[] {5, 4, -1, 7, 8}), equalTo(23));
    }
}
