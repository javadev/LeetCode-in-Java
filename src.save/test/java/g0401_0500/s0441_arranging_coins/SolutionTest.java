package g0401_0500.s0441_arranging_coins;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findKthNumber() {
        assertThat(new Solution().arrangeCoins(5), equalTo(2));
    }

    @Test
    void arrangeCoins2() {
        assertThat(new Solution().arrangeCoins(8), equalTo(3));
    }
}
