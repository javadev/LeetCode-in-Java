package g2501_2600.s2561_rearranging_fruits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution().minCost(new int[] {4, 2, 2, 2}, new int[] {1, 4, 1, 2}),
                equalTo(1L));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution().minCost(new int[] {2, 3, 4, 1}, new int[] {3, 2, 5, 1}),
                equalTo(-1L));
    }
}
