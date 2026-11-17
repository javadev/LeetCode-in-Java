package g4001_4100.s4003_minimum_cost_path_with_alternating_directions_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost(2, 2, new int[][] {{5, 3}, {1, 4}}), equalTo(8L));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(2, 2, new int[][] {{0, 7}, {3, 2}}), equalTo(7L));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost(2, 3, new int[][] {{8, 0, 9}, {7, 4, 1}}), equalTo(12L));
    }
}
