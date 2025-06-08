package g3501_3600.s3573_best_time_to_buy_and_sell_stock_v;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumProfit() {
        assertThat(new Solution().maximumProfit(new int[] {1, 7, 9, 8, 2}, 2), equalTo(14L));
    }

    @Test
    void maximumProfit2() {
        assertThat(
                new Solution().maximumProfit(new int[] {12, 16, 19, 19, 8, 1, 19, 13, 9}, 3),
                equalTo(36L));
    }
}
