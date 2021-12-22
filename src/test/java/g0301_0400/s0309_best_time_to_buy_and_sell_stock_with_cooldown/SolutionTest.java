package g0301_0400.s0309_best_time_to_buy_and_sell_stock_with_cooldown;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProfit() {
        assertThat(new Solution().maxProfit(new int[] {1, 2, 3, 0, 2}), equalTo(3));
    }

    @Test
    void maxProfit2() {
        assertThat(new Solution().maxProfit(new int[] {1}), equalTo(0));
    }
}
