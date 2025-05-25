package g3501_3600.s3562_maximum_profit_from_trading_stocks_with_discounts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProfit() {
        assertThat(
                new Solution()
                        .maxProfit(2, new int[] {1, 2}, new int[] {4, 3}, new int[][] {{1, 2}}, 3),
                equalTo(5));
    }

    @Test
    void maxProfit2() {
        assertThat(
                new Solution()
                        .maxProfit(2, new int[] {3, 4}, new int[] {5, 8}, new int[][] {{1, 2}}, 4),
                equalTo(4));
    }

    @Test
    void maxProfit3() {
        assertThat(
                new Solution()
                        .maxProfit(
                                3,
                                new int[] {4, 6, 8},
                                new int[] {7, 9, 11},
                                new int[][] {{1, 2}, {1, 3}},
                                10),
                equalTo(10));
    }

    @Test
    void maxProfit4() {
        assertThat(
                new Solution()
                        .maxProfit(
                                3,
                                new int[] {5, 2, 3},
                                new int[] {8, 5, 6},
                                new int[][] {{1, 2}, {1, 3}},
                                7),
                equalTo(12));
    }
}
