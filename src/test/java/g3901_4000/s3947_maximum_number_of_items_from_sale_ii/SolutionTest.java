package g3901_4000.s3947_maximum_number_of_items_from_sale_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSaleItems() {
        assertThat(
                new Solution().maximumSaleItems(new int[][] {{1, 6}, {2, 4}, {3, 5}}, 19),
                equalTo(5));
    }

    @Test
    void maximumSaleItems2() {
        assertThat(
                new Solution()
                        .maximumSaleItems(
                                new int[][] {{2, 8}, {1, 10}, {6, 6}, {4, 12}, {5, 20}, {5, 17}},
                                35),
                equalTo(7));
    }

    @Test
    void maximumSaleItems3() {
        assertThat(
                new Solution().maximumSaleItems(new int[][] {{1, 6}, {2, 4}, {3, 5}}, 6),
                equalTo(2));
    }
}
