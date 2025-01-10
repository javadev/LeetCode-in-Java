package g3401_3500.s3413_maximum_coins_from_k_consecutive_bags;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumCoins() {
        assertThat(
                new Solution().maximumCoins(new int[][] {{8, 10, 1}, {1, 3, 2}, {5, 6, 4}}, 4),
                equalTo(10L));
    }

    @Test
    void maximumCoins2() {
        assertThat(new Solution().maximumCoins(new int[][] {{1, 10, 3}}, 2), equalTo(6L));
    }
}
