package g2901_3000.s2952_minimum_number_of_coins_to_be_added;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumAddedCoins() {
        assertThat(new Solution().minimumAddedCoins(new int[] {1, 4, 10}, 19), equalTo(2));
    }

    @Test
    void minimumAddedCoins2() {
        assertThat(
                new Solution().minimumAddedCoins(new int[] {1, 4, 10, 5, 7, 19}, 19), equalTo(1));
    }

    @Test
    void minimumAddedCoins3() {
        assertThat(new Solution().minimumAddedCoins(new int[] {1, 1, 1}, 20), equalTo(3));
    }
}
