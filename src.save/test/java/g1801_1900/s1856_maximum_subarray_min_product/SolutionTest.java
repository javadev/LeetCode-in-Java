package g1801_1900.s1856_maximum_subarray_min_product;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumMinProduct() {
        assertThat(new Solution().maxSumMinProduct(new int[] {1, 2, 3, 2}), equalTo(14));
    }

    @Test
    void maxSumMinProduct2() {
        assertThat(new Solution().maxSumMinProduct(new int[] {2, 3, 3, 1, 2}), equalTo(18));
    }

    @Test
    void maxSumMinProduct3() {
        assertThat(new Solution().maxSumMinProduct(new int[] {3, 1, 5, 6, 4, 2}), equalTo(60));
    }
}
