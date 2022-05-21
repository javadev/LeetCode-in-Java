package g1901_2000.s1969_minimum_non_zero_product_of_the_array_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minNonZeroProduct() {
        assertThat(new Solution().minNonZeroProduct(2), equalTo(6));
    }

    @Test
    void minNonZeroProduct2() {
        assertThat(new Solution().minNonZeroProduct(3), equalTo(1512));
    }
}
