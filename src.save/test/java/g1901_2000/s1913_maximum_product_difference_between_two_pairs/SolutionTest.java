package g1901_2000.s1913_maximum_product_difference_between_two_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProductDifference() {
        assertThat(new Solution().maxProductDifference(new int[] {5, 6, 2, 7, 4}), equalTo(34));
    }

    @Test
    void maxProductDifference2() {
        assertThat(
                new Solution().maxProductDifference(new int[] {4, 2, 5, 9, 7, 4, 8}), equalTo(64));
    }
}
