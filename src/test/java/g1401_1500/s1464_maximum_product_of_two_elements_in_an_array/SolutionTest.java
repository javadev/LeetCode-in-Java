package g1401_1500.s1464_maximum_product_of_two_elements_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        assertThat(new Solution().maxProduct(new int[] {3, 4, 5, 2}), equalTo(12));
    }

    @Test
    void maxProduct2() {
        assertThat(new Solution().maxProduct(new int[] {1, 5, 4, 5}), equalTo(16));
    }

    @Test
    void maxProduct3() {
        assertThat(new Solution().maxProduct(new int[] {3, 7}), equalTo(12));
    }
}
