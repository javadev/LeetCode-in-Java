package g2301_2400.s2368_reachable_nodes_with_restrictions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reachableNodes() {
        assertThat(
                new Solution()
                        .reachableNodes(
                                7,
                                new int[][] {{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}},
                                new int[] {4, 5}),
                equalTo(4));
    }

    @Test
    void reachableNodes2() {
        assertThat(
                new Solution()
                        .reachableNodes(
                                7,
                                new int[][] {{0, 1}, {0, 2}, {0, 5}, {0, 4}, {3, 2}, {6, 5}},
                                new int[] {4, 2, 1}),
                equalTo(3));
    }
}
