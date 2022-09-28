package g0801_0900.s0834_sum_of_distances_in_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfDistancesInTree() {
        assertThat(
                new Solution()
                        .sumOfDistancesInTree(
                                6, new int[][] {{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}}),
                equalTo(new int[] {8, 12, 6, 10, 10, 10}));
    }

    @Test
    void sumOfDistancesInTree2() {
        assertThat(new Solution().sumOfDistancesInTree(1, new int[][] {}), equalTo(new int[] {0}));
    }

    @Test
    void sumOfDistancesInTree3() {
        assertThat(
                new Solution().sumOfDistancesInTree(2, new int[][] {{1, 0}}),
                equalTo(new int[] {1, 1}));
    }
}
