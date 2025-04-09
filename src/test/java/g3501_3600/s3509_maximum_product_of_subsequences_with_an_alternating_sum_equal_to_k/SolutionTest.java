package g3501_3600.s3509_maximum_product_of_subsequences_with_an_alternating_sum_equal_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        assertThat(new Solution().maxProduct(new int[] {1, 2, 3}, 2, 10), equalTo(6));
    }

    @Test
    void maxProduct2() {
        assertThat(new Solution().maxProduct(new int[] {0, 2, 3}, -5, 12), equalTo(-1));
    }

    @Test
    void maxProduct3() {
        assertThat(new Solution().maxProduct(new int[] {2, 2, 3, 3}, 0, 9), equalTo(9));
    }

    @Test
    void maxProduct4() {
        assertThat(new Solution().maxProduct(new int[] {12, 0, 9}, 21, 20), equalTo(0));
    }
}
