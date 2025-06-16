package g3501_3600.s3584_maximum_product_of_first_and_last_elements_of_a_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumProduct() {
        assertThat(
                new Solution().maximumProduct(new int[] {-1, -9, 2, 3, -2, -3, 1}, 1),
                equalTo(81L));
    }

    @Test
    void maximumProduct2() {
        assertThat(new Solution().maximumProduct(new int[] {1, 3, -5, 5, 6, -4}, 3), equalTo(20L));
    }

    @Test
    void maximumProduct3() {
        assertThat(
                new Solution().maximumProduct(new int[] {2, -1, 2, -6, 5, 2, -5, 7}, 2),
                equalTo(35L));
    }
}
