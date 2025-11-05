package g3701_3800.s3732_maximum_product_of_three_elements_after_one_replacement;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        assertThat(new Solution().maxProduct(new int[] {-5, 7, 0}), equalTo(3500000L));
    }

    @Test
    void maxProduct2() {
        assertThat(new Solution().maxProduct(new int[] {-4, -2, -1, -3}), equalTo(1200000L));
    }

    @Test
    void maxProduct3() {
        assertThat(new Solution().maxProduct(new int[] {0, 10, 0}), equalTo(0L));
    }
}
