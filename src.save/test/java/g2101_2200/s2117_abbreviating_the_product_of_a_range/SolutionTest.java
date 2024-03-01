package g2101_2200.s2117_abbreviating_the_product_of_a_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void abbreviateProduct() {
        assertThat(new Solution().abbreviateProduct(1, 4), equalTo("24e0"));
    }

    @Test
    void abbreviateProduct2() {
        assertThat(new Solution().abbreviateProduct(2, 11), equalTo("399168e2"));
    }

    @Test
    void abbreviateProduct3() {
        assertThat(new Solution().abbreviateProduct(371, 375), equalTo("7219856259e3"));
    }

    @Test
    void abbreviateProduct4() {
        assertThat(new Solution().abbreviateProduct(10000, 100005), equalTo("99240...51744e22505"));
    }
}
