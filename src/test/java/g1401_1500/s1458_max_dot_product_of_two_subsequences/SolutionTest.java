package g1401_1500.s1458_max_dot_product_of_two_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDotProduct() {
        assertThat(
                new Solution().maxDotProduct(new int[] {2, 1, -2, 5}, new int[] {3, 0, -6}),
                equalTo(18));
    }

    @Test
    void maxDotProduct2() {
        assertThat(
                new Solution().maxDotProduct(new int[] {3, -2}, new int[] {2, -6, 7}), equalTo(21));
    }

    @Test
    void maxDotProduct3() {
        assertThat(new Solution().maxDotProduct(new int[] {-1, -1}, new int[] {1, 1}), equalTo(-1));
    }
}
