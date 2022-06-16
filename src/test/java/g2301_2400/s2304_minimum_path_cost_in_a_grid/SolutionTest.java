package g2301_2400.s2304_minimum_path_cost_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPathCost() {
        assertThat(
                new Solution()
                        .minPathCost(
                                new int[][] {{5, 3}, {4, 0}, {2, 1}},
                                new int[][] {{9, 8}, {1, 5}, {10, 12}, {18, 6}, {2, 4}, {14, 3}}),
                equalTo(17));
    }

    @Test
    void minPathCost2() {
        assertThat(
                new Solution()
                        .minPathCost(
                                new int[][] {{5, 1, 2}, {4, 0, 3}},
                                new int[][] {
                                    {12, 10, 15},
                                    {20, 23, 8},
                                    {21, 7, 1},
                                    {8, 1, 13},
                                    {9, 10, 25},
                                    {5, 3, 2}
                                }),
                equalTo(6));
    }
}
