package g0701_0800.s0713_subarray_product_less_than_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSubarrayProductLessThanK() {
        assertThat(
                new Solution().numSubarrayProductLessThanK(new int[] {10, 5, 2, 6}, 100),
                equalTo(8));
    }

    @Test
    void numSubarrayProductLessThanK2() {
        assertThat(new Solution().numSubarrayProductLessThanK(new int[] {1, 2, 3}, 0), equalTo(0));
    }
}
