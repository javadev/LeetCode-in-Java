package g0101_0200.s0123_best_time_to_buy_and_sell_stock_iii_hard_array_dynamic_programming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxProfit() {
        assertThat(new Solution().maxProfit(new int[] {3, 3, 5, 0, 0, 3, 1, 4}), equalTo(6));
    }
}
