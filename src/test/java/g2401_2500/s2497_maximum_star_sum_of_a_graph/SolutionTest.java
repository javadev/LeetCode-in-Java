package g2401_2500.s2497_maximum_star_sum_of_a_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxStarSum() {
        assertThat(
                new Solution()
                        .maxStarSum(
                                new int[] {1, 2, 3, 4, 10, -10, -20},
                                new int[][] {{0, 1}, {1, 2}, {1, 3}, {3, 4}, {3, 5}, {3, 6}},
                                2),
                equalTo(16));
    }

    @Test
    void maxStarSum2() {
        assertThat(new Solution().maxStarSum(new int[] {-5}, new int[][] {}, 0), equalTo(-5));
    }
}
