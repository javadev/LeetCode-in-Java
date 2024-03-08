package g2901_3000.s2944_minimum_number_of_coins_for_fruits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCoins() {
        assertThat(new Solution().minimumCoins(new int[] {3, 1, 2}), equalTo(4));
    }

    @Test
    void minimumCoins2() {
        assertThat(new Solution().minimumCoins(new int[] {1, 10, 1, 1}), equalTo(2));
    }
}
