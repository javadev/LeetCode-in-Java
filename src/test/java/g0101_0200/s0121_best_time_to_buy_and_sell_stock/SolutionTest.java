package g0101_0200.s0121_best_time_to_buy_and_sell_stock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProfit() {
        assertThat(new Solution().maxProfit(new int[] {7, 1, 5, 3, 6, 4}), equalTo(5));
    }

    @Test
    void maxProfit2() {
        assertThat(new Solution().maxProfit(new int[] {7, 6, 4, 3, 1}), equalTo(0));
    }
}
