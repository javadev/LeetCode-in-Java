package g3801_3900.s3857_minimum_cost_to_split_into_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void calculatesMinimumSplitCost() {
        Solution solution = new Solution();

        assertThat(solution.minCost(1), equalTo(0));
        assertThat(solution.minCost(3), equalTo(3));
        assertThat(solution.minCost(4), equalTo(6));
    }
}
