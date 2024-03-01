package g1901_2000.s1928_minimum_cost_to_reach_destination_in_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution()
                        .minCost(
                                30,
                                new int[][] {
                                    {0, 1, 10},
                                    {1, 2, 10},
                                    {2, 5, 10},
                                    {0, 3, 1},
                                    {3, 4, 10},
                                    {4, 5, 15}
                                },
                                new int[] {5, 1, 2, 20, 20, 3}),
                equalTo(11));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution()
                        .minCost(
                                29,
                                new int[][] {
                                    {0, 1, 10},
                                    {1, 2, 10},
                                    {2, 5, 10},
                                    {0, 3, 1},
                                    {3, 4, 10},
                                    {4, 5, 15}
                                },
                                new int[] {5, 1, 2, 20, 20, 3}),
                equalTo(48));
    }

    @Test
    void minCost3() {
        assertThat(
                new Solution()
                        .minCost(
                                25,
                                new int[][] {
                                    {0, 1, 10},
                                    {1, 2, 10},
                                    {2, 5, 10},
                                    {0, 3, 1},
                                    {3, 4, 10},
                                    {4, 5, 15}
                                },
                                new int[] {5, 1, 2, 20, 20, 3}),
                equalTo(-1));
    }
}
