package g2201_2300.s2233_maximum_product_after_k_increments;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumProduct() {
        assertThat(new Solution().maximumProduct(new int[] {0, 4}, 5), equalTo(20));
    }

    @Test
    void maximumProduct2() {
        assertThat(new Solution().maximumProduct(new int[] {6, 3, 3, 2}, 2), equalTo(216));
    }
}
