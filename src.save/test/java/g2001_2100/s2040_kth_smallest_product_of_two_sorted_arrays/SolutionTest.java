package g2001_2100.s2040_kth_smallest_product_of_two_sorted_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthSmallestProduct() {
        assertThat(
                new Solution().kthSmallestProduct(new int[] {2, 5}, new int[] {3, 4}, 2),
                equalTo(8L));
    }

    @Test
    void kthSmallestProduct2() {
        assertThat(
                new Solution().kthSmallestProduct(new int[] {-4, -2, 0, 3}, new int[] {2, 4}, 6),
                equalTo(0L));
    }

    @Test
    void kthSmallestProduct3() {
        assertThat(
                new Solution()
                        .kthSmallestProduct(
                                new int[] {-2, -1, 0, 1, 2}, new int[] {-3, -1, 2, 4, 5}, 3),
                equalTo(-6L));
    }
}
