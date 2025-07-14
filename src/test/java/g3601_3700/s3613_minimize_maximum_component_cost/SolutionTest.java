package g3601_3700.s3613_minimize_maximum_component_cost;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution()
                        .minCost(5, new int[][] {{0, 1, 4}, {1, 2, 3}, {1, 3, 2}, {3, 4, 6}}, 2),
                equalTo(4));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution().minCost(4, new int[][] {{0, 1, 5}, {1, 2, 5}, {2, 3, 5}}, 1),
                equalTo(5));
    }
}
