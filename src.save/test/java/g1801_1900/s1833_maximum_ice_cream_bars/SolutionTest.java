package g1801_1900.s1833_maximum_ice_cream_bars;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxIceCream() {
        assertThat(new Solution().maxIceCream(new int[] {1, 3, 2, 4, 1}, 7), equalTo(4));
    }

    @Test
    void maxIceCream2() {
        assertThat(new Solution().maxIceCream(new int[] {10, 6, 8, 7, 7, 8}, 5), equalTo(0));
    }

    @Test
    void maxIceCream3() {
        assertThat(new Solution().maxIceCream(new int[] {1, 6, 3, 1, 2, 5}, 20), equalTo(6));
    }
}
