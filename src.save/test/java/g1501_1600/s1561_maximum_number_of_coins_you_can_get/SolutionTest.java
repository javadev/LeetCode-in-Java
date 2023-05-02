package g1501_1600.s1561_maximum_number_of_coins_you_can_get;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxCoins() {
        assertThat(new Solution().maxCoins(new int[] {2, 4, 1, 2, 7, 8}), equalTo(9));
    }

    @Test
    void maxCoins2() {
        assertThat(new Solution().maxCoins(new int[] {2, 4, 5}), equalTo(4));
    }

    @Test
    void maxCoins3() {
        assertThat(new Solution().maxCoins(new int[] {9, 8, 7, 6, 5, 1, 2, 3, 4}), equalTo(18));
    }
}
