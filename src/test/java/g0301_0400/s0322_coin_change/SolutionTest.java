package g0301_0400.s0322_coin_change;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void coinChange() {
        assertThat(new Solution().coinChange(new int[] {1, 2, 5}, 11), equalTo(3));
    }

    @Test
    void coinChange2() {
        assertThat(new Solution().coinChange(new int[] {2}, 3), equalTo(-1));
    }

    @Test
    void coinChange3() {
        assertThat(new Solution().coinChange(new int[] {1}, 0), equalTo(0));
    }
}
