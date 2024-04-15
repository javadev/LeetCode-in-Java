package g2901_3000.s2939_maximum_xor_product;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumXorProduct() {
        assertThat(new Solution().maximumXorProduct(12, 5, 4), equalTo(98));
    }

    @Test
    void maximumXorProduct2() {
        assertThat(new Solution().maximumXorProduct(6, 7, 5), equalTo(930));
    }

    @Test
    void maximumXorProduct3() {
        assertThat(new Solution().maximumXorProduct(1, 6, 3), equalTo(12));
    }
}
