package g3801_3900.s3868_minimum_cost_to_equalize_arrays_using_swaps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsRequiredCrossArraySwapsOrReportsImpossible() {
        Solution solution = new Solution();

        assertThat(solution.minCost(new int[] {10, 20}, new int[] {20, 10}), equalTo(0));
        assertThat(solution.minCost(new int[] {10, 10}, new int[] {20, 20}), equalTo(1));
        assertThat(solution.minCost(new int[] {10, 20}, new int[] {30, 40}), equalTo(-1));
    }
}
