package g3301_3400.s3372_maximize_the_number_of_target_nodes_after_connecting_trees_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTargetNodes() {
        assertThat(
                new Solution()
                        .maxTargetNodes(
                                new int[][] {{0, 1}, {0, 2}, {2, 3}, {2, 4}},
                                new int[][] {
                                    {0, 1}, {0, 2}, {0, 3}, {2, 7}, {1, 4}, {4, 5}, {4, 6}
                                },
                                2),
                equalTo(new int[] {9, 7, 9, 8, 8}));
    }

    @Test
    void maxTargetNodes2() {
        assertThat(
                new Solution()
                        .maxTargetNodes(
                                new int[][] {{0, 1}, {0, 2}, {0, 3}, {0, 4}},
                                new int[][] {{0, 1}, {1, 2}, {2, 3}},
                                1),
                equalTo(new int[] {6, 3, 3, 3, 3}));
    }
}
