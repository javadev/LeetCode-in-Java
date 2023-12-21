package g1301_1400.s1368_minimum_cost_to_make_at_least_one_valid_path_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution()
                        .minCost(
                                new int[][] {
                                    {1, 1, 1, 1}, {2, 2, 2, 2}, {1, 1, 1, 1}, {2, 2, 2, 2}
                                }),
                equalTo(3));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution().minCost(new int[][] {{1, 1, 3}, {3, 2, 2}, {1, 1, 4}}), equalTo(0));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost(new int[][] {{1, 2}, {4, 3}}), equalTo(1));
    }
}
