package g2001_2100.s2087_minimum_cost_homecoming_of_a_robot_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution()
                        .minCost(
                                new int[] {1, 0},
                                new int[] {2, 3},
                                new int[] {5, 4, 3},
                                new int[] {8, 2, 6, 7}),
                equalTo(18));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution()
                        .minCost(new int[] {0, 0}, new int[] {0, 0}, new int[] {5}, new int[] {26}),
                equalTo(0));
    }
}
