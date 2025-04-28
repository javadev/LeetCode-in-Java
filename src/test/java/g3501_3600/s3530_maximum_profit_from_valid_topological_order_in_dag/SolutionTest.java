package g3501_3600.s3530_maximum_profit_from_valid_topological_order_in_dag;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProfit() {
        assertThat(new Solution().maxProfit(2, new int[][] {{0, 1}}, new int[] {2, 3}), equalTo(8));
    }

    @Test
    void maxProfit2() {
        assertThat(
                new Solution().maxProfit(3, new int[][] {{0, 1}, {0, 2}}, new int[] {1, 6, 3}),
                equalTo(25));
    }
}
