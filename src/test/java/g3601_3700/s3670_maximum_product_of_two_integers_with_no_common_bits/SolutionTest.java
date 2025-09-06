package g3601_3700.s3670_maximum_product_of_two_integers_with_no_common_bits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        assertThat(new Solution().maxProduct(new int[] {1, 2, 3, 4, 5, 6, 7}), equalTo(12L));
    }

    @Test
    void maxProduct2() {
        assertThat(new Solution().maxProduct(new int[] {4, 5, 6}), equalTo(0L));
    }

    @Test
    void maxProduct3() {
        assertThat(new Solution().maxProduct(new int[] {64, 8, 32}), equalTo(2048L));
    }
}
