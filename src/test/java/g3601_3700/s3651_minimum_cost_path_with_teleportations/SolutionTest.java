package g3601_3700.s3651_minimum_cost_path_with_teleportations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution().minCost(new int[][] {{1, 3, 3}, {2, 5, 4}, {4, 3, 5}}, 2),
                equalTo(7));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(new int[][] {{1, 2}, {2, 3}, {3, 4}}, 1), equalTo(9));
    }
}
