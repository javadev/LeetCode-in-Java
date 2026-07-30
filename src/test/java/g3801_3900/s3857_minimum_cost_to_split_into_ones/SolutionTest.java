package g3801_3900.s3857_minimum_cost_to_split_into_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost(1), equalTo(0));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(3), equalTo(3));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost(4), equalTo(6));
    }
}
