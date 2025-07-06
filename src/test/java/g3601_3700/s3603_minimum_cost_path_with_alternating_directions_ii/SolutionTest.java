package g3601_3700.s3603_minimum_cost_path_with_alternating_directions_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost(1, 2, new int[][] {{1, 2}}), equalTo(3L));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(2, 2, new int[][] {{3, 5}, {2, 4}}), equalTo(9L));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost(2, 3, new int[][] {{6, 1, 4}, {3, 2, 5}}), equalTo(16L));
    }
}
