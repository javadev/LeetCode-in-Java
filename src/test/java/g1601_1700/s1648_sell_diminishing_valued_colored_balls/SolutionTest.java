package g1601_1700.s1648_sell_diminishing_valued_colored_balls;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProfit() {
        assertThat(new Solution().maxProfit(new int[] {2, 5}, 4), equalTo(14));
    }

    @Test
    void maxProfit2() {
        assertThat(new Solution().maxProfit(new int[] {3, 5}, 6), equalTo(19));
    }
}
