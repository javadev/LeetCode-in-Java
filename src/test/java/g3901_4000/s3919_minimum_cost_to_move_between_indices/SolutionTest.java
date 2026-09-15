package g3901_4000.s3919_minimum_cost_to_move_between_indices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution().minCost(new int[] {-5, -2, 3}, new int[][] {{0, 2}, {2, 0}, {1, 2}}),
                equalTo(new int[] {6, 2, 5}));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution()
                        .minCost(new int[] {0, 2, 3, 9}, new int[][] {{3, 0}, {1, 2}, {2, 0}}),
                equalTo(new int[] {4, 1, 3}));
    }
}
