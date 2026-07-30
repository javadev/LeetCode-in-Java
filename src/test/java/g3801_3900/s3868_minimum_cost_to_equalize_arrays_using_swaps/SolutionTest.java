package g3801_3900.s3868_minimum_cost_to_equalize_arrays_using_swaps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost(new int[] {10, 20}, new int[] {20, 10}), equalTo(0));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(new int[] {10, 10}, new int[] {20, 20}), equalTo(1));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost(new int[] {10, 20}, new int[] {30, 40}), equalTo(-1));
    }
}
