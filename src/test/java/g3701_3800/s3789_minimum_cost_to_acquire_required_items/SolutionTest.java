package g3701_3800.s3789_minimum_cost_to_acquire_required_items;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(new Solution().minimumCost(3, 2, 1, 3, 2), equalTo(3L));
    }

    @Test
    void minimumCost2() {
        assertThat(new Solution().minimumCost(5, 4, 15, 2, 3), equalTo(22L));
    }

    @Test
    void minimumCost3() {
        assertThat(new Solution().minimumCost(5, 4, 15, 0, 0), equalTo(0L));
    }
}
