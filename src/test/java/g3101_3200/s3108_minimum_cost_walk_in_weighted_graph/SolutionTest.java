package g3101_3200.s3108_minimum_cost_walk_in_weighted_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(
                new Solution()
                        .minimumCost(
                                5,
                                new int[][] {{0, 1, 7}, {1, 3, 7}, {1, 2, 1}},
                                new int[][] {{0, 3}, {3, 4}}),
                equalTo(new int[] {1, -1}));
    }

    @Test
    void minimumCost2() {
        assertThat(
                new Solution()
                        .minimumCost(
                                3,
                                new int[][] {{0, 2, 7}, {0, 1, 15}, {1, 2, 6}, {1, 2, 1}},
                                new int[][] {{1, 2}}),
                equalTo(new int[] {0}));
    }
}
