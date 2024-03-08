package g0101_0200.s0152_maximum_product_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        assertThat(new Solution().maxProduct(new int[] {2, 3, -2, 4}), equalTo(6));
    }

    @Test
    void maxProduct2() {
        assertThat(new Solution().maxProduct(new int[] {-2, 0, -1}), equalTo(0));
    }
}
