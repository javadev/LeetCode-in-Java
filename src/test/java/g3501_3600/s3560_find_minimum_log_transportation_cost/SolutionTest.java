package g3501_3600.s3560_find_minimum_log_transportation_cost;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCuttingCost() {
        assertThat(new Solution().minCuttingCost(6, 5, 5), equalTo(5L));
    }

    @Test
    void minCuttingCost2() {
        assertThat(new Solution().minCuttingCost(4, 4, 6), equalTo(0L));
    }
}
