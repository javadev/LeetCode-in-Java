package g3501_3600.s3536_maximum_product_of_two_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        assertThat(new Solution().maxProduct(31), equalTo(3));
    }

    @Test
    void maxProduct2() {
        assertThat(new Solution().maxProduct(22), equalTo(4));
    }

    @Test
    void maxProduct3() {
        assertThat(new Solution().maxProduct(124), equalTo(8));
    }

    @Test
    void maxProduct4() {
        assertThat(new Solution().maxProduct(453), equalTo(20));
    }

    @Test
    void maxProduct5() {
        assertThat(new Solution().maxProduct(437), equalTo(28));
    }

    @Test
    void maxProduct6() {
        assertThat(new Solution().maxProduct(724), equalTo(28));
    }
}
