package g2401_2500.s2448_minimum_cost_to_make_array_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution().minCost(new int[] {1, 3, 5, 2}, new int[] {2, 3, 1, 14}),
                equalTo(8L));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution().minCost(new int[] {2, 2, 2, 2, 2}, new int[] {4, 2, 8, 1, 3}),
                equalTo(0L));
    }
}
