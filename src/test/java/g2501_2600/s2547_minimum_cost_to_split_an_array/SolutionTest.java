package g2501_2600.s2547_minimum_cost_to_split_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost(new int[] {1, 2, 1, 2, 1, 3, 3}, 2), equalTo(8));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(new int[] {1, 2, 1, 2, 1}, 2), equalTo(6));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost(new int[] {1, 2, 1, 2, 1}, 5), equalTo(10));
    }
}
