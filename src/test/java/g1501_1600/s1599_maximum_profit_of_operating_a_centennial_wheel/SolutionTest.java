package g1501_1600.s1599_maximum_profit_of_operating_a_centennial_wheel;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperationsMaxProfit() {
        assertThat(new Solution().minOperationsMaxProfit(new int[] {8, 3}, 5, 6), equalTo(3));
    }

    @Test
    void minOperationsMaxProfit2() {
        assertThat(new Solution().minOperationsMaxProfit(new int[] {10, 9, 6}, 6, 4), equalTo(7));
    }

    @Test
    void minOperationsMaxProfit3() {
        assertThat(
                new Solution().minOperationsMaxProfit(new int[] {3, 4, 0, 5, 1}, 1, 92),
                equalTo(-1));
    }
}
