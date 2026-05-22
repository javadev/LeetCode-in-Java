package g3701_3800.s3786_total_sum_of_interaction_cost_in_tree_groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void interactionCosts() {
        assertThat(
                new Solution()
                        .interactionCosts(3, new int[][] {{0, 1}, {1, 2}}, new int[] {1, 1, 1}),
                equalTo(4L));
    }

    @Test
    void interactionCosts2() {
        assertThat(
                new Solution()
                        .interactionCosts(3, new int[][] {{0, 1}, {1, 2}}, new int[] {3, 2, 3}),
                equalTo(2L));
    }

    @Test
    void interactionCosts3() {
        assertThat(
                new Solution()
                        .interactionCosts(
                                4, new int[][] {{0, 1}, {0, 2}, {0, 3}}, new int[] {1, 1, 4, 4}),
                equalTo(3L));
    }

    @Test
    void interactionCosts4() {
        assertThat(
                new Solution().interactionCosts(2, new int[][] {{0, 1}}, new int[] {9, 8}),
                equalTo(0L));
    }
}
