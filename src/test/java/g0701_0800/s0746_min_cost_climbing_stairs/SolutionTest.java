package g0701_0800.s0746_min_cost_climbing_stairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCostClimbingStairs() {
        assertThat(new Solution().minCostClimbingStairs(new int[] {10, 15, 20}), equalTo(15));
    }

    @Test
    void minCostClimbingStairs2() {
        assertThat(
                new Solution()
                        .minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}),
                equalTo(6));
    }
}
