package g3901_4000.s3946_maximum_number_of_items_from_sale_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSaleItems() {
        assertThat(
                new Solution().maximumSaleItems(new int[][] {{6, 2}, {2, 6}, {3, 4}}, 9),
                equalTo(4));
    }

    @Test
    void maximumSaleItems2() {
        assertThat(
                new Solution()
                        .maximumSaleItems(new int[][] {{2, 4}, {3, 2}, {4, 1}, {6, 4}, {12, 4}}, 8),
                equalTo(10));
    }

    @Test
    void maximumSaleItems3() {
        assertThat(new Solution().maximumSaleItems(new int[][] {{1, 1}}, 1), equalTo(1));
    }
}
