package g0701_0800.s0714_best_time_to_buy_and_sell_stock_with_transaction_fee;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProfit() {
        assertThat(new Solution().maxProfit(new int[] {1, 3, 2, 8, 4, 9}, 2), equalTo(8));
    }

    @Test
    void maxProfit2() {
        assertThat(new Solution().maxProfit(new int[] {1, 3, 7, 5, 10, 3}, 3), equalTo(6));
    }
}
