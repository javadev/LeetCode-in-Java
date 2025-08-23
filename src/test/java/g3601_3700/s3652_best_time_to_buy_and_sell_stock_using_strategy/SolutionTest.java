package g3601_3700.s3652_best_time_to_buy_and_sell_stock_using_strategy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProfit() {
        assertThat(
                new Solution().maxProfit(new int[] {4, 2, 8}, new int[] {-1, 0, 1}, 2),
                equalTo(10L));
    }

    @Test
    void maxProfit2() {
        assertThat(
                new Solution().maxProfit(new int[] {5, 4, 3}, new int[] {1, 1, 0}, 2), equalTo(9L));
    }
}
