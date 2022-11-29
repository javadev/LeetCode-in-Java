package g2101_2200.s2162_minimum_cost_to_set_cooking_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCostSetTime() {
        assertThat(new Solution().minCostSetTime(1, 2, 1, 600), equalTo(6));
    }

    @Test
    void minCostSetTime2() {
        assertThat(new Solution().minCostSetTime(0, 1, 2, 76), equalTo(6));
    }

    @Test
    void minCostSetTime3() {
        assertThat(new Solution().minCostSetTime(0, 9, 18, 460), equalTo(81));
    }
}
