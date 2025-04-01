package g3501_3600.s3502_minimum_cost_to_reach_every_position;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCosts() {
        assertThat(
                new Solution().minCosts(new int[] {5, 3, 4, 1, 3, 2}),
                equalTo(new int[] {5, 3, 3, 1, 1, 1}));
    }

    @Test
    void minCosts2() {
        assertThat(
                new Solution().minCosts(new int[] {1, 2, 4, 6, 7}),
                equalTo(new int[] {1, 1, 1, 1, 1}));
    }
}
