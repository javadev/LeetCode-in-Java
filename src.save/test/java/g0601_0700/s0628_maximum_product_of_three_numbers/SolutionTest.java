package g0601_0700.s0628_maximum_product_of_three_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumProduct() {
        assertThat(new Solution().maximumProduct(new int[] {1, 2, 3}), equalTo(6));
    }

    @Test
    void maximumProduct2() {
        assertThat(new Solution().maximumProduct(new int[] {1, 2, 3, 4}), equalTo(24));
    }

    @Test
    void maximumProduct3() {
        assertThat(new Solution().maximumProduct(new int[] {-1, -2, -3}), equalTo(-6));
    }
}
