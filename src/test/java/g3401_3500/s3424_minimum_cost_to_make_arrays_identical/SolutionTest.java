package g3401_3500.s3424_minimum_cost_to_make_arrays_identical;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution().minCost(new int[] {-7, 9, 5}, new int[] {7, -2, -5}, 2),
                equalTo(13L));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(new int[] {2, 1}, new int[] {2, 1}, 0), equalTo(0L));
    }
}
