package g3901_4000.s3928_minimum_cost_to_buy_apples_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution().minCost(2, new int[] {8, 3}, new int[][] {{0, 1, 1, 2}}),
                equalTo(new int[] {6, 3}));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution()
                        .minCost(3, new int[] {9, 4, 6}, new int[][] {{0, 1, 1, 3}, {1, 2, 4, 2}}),
                equalTo(new int[] {8, 4, 6}));
    }

    @Test
    void minCost3() {
        assertThat(
                new Solution()
                        .minCost(
                                3,
                                new int[] {10, 11, 1},
                                new int[][] {{0, 2, 1, 3}, {1, 2, 3, 4}, {0, 1, 5, 2}}),
                equalTo(new int[] {5, 11, 1}));
    }

    @Test
    void minCost4() {
        assertThat(
                new Solution().minCost(2, new int[] {4, 2}, new int[][] {}),
                equalTo(new int[] {4, 2}));
    }

    @Test
    void minCost5() {
        assertThat(
                new Solution()
                        .minCost(
                                3,
                                new int[] {100, 100, 1},
                                new int[][] {{0, 2, 1, 100}, {0, 1, 2, 1}, {1, 2, 2, 1}}),
                equalTo(new int[] {6, 5, 1}));
    }

    @Test
    void minCost6() {
        assertThat(
                new Solution()
                        .minCost(
                                2,
                                new int[] {1000000000, 1},
                                new int[][] {{0, 1, 1000000000, 100}}),
                equalTo(new int[] {1000000000, 1}));
    }

    @Test
    void minCost7() {
        assertThat(
                new Solution().minCost(1, new int[] {7}, new int[][] {}), equalTo(new int[] {7}));
    }
}
