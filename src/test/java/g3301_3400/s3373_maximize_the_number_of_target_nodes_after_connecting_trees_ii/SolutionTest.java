package g3301_3400.s3373_maximize_the_number_of_target_nodes_after_connecting_trees_ii;

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
                                }),
                equalTo(new int[] {8, 7, 7, 8, 8}));
    }

    @Test
    void maxTargetNodes2() {
        assertThat(
                new Solution()
                        .maxTargetNodes(
                                new int[][] {{0, 1}, {0, 2}, {0, 3}, {0, 4}},
                                new int[][] {{0, 1}, {1, 2}, {2, 3}}),
                equalTo(new int[] {3, 6, 6, 6, 6}));
    }
}
