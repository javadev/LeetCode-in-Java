package g1501_1600.s1547_minimum_cost_to_cut_a_stick;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost(7, new int[] {1, 3, 4, 5}), equalTo(16));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(9, new int[] {5, 6, 1, 4, 2}), equalTo(22));
    }
}
