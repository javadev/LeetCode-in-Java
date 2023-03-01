package g0801_0900.s0882_reachable_nodes_in_subdivided_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reachableNodes() {
        assertThat(
                new Solution().reachableNodes(new int[][] {{0, 1, 10}, {0, 2, 1}, {1, 2, 2}}, 6, 3),
                equalTo(13));
    }

    @Test
    void reachableNodes2() {
        assertThat(
                new Solution()
                        .reachableNodes(
                                new int[][] {{0, 1, 4}, {1, 2, 6}, {0, 2, 8}, {1, 3, 1}}, 10, 4),
                equalTo(23));
    }

    @Test
    void reachableNodes3() {
        assertThat(
                new Solution()
                        .reachableNodes(
                                new int[][] {{1, 2, 4}, {1, 4, 5}, {1, 3, 1}, {2, 3, 4}, {3, 4, 5}},
                                17,
                                5),
                equalTo(1));
    }
}
