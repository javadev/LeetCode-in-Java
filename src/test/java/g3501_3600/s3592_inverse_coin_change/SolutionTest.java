package g3501_3600.s3592_inverse_coin_change;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findCoins() {
        assertThat(
                new Solution().findCoins(new int[] {0, 1, 0, 2, 0, 3, 0, 4, 0, 5}),
                equalTo(List.of(2, 4, 6)));
    }

    @Test
    void findCoins2() {
        assertThat(new Solution().findCoins(new int[] {1, 2, 2, 3, 4}), equalTo(List.of(1, 2, 5)));
    }

    @Test
    void findCoins3() {
        assertThat(new Solution().findCoins(new int[] {1, 2, 3, 4, 15}), equalTo(List.of()));
    }
}
