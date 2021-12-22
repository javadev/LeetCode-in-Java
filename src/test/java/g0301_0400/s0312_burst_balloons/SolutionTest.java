package g0301_0400.s0312_burst_balloons;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxCoins() {
        assertThat(new Solution().maxCoins(new int[] {3, 1, 5, 8}), equalTo(167));
    }

    @Test
    void maxCoins2() {
        assertThat(new Solution().maxCoins(new int[] {1, 5}), equalTo(10));
    }
}
