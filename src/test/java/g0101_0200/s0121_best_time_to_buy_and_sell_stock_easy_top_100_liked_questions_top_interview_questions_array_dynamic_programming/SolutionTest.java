package g0101_0200.s0121_best_time_to_buy_and_sell_stock_easy_top_100_liked_questions_top_interview_questions_array_dynamic_programming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void bestTimeToBuyAndSellStock() {
        assertThat(new Solution().maxProfit(new int[] {7, 1, 5, 3, 6, 4}), equalTo(5));
    }
}
