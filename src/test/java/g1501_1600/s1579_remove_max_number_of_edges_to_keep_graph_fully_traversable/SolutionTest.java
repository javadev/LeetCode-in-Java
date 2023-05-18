package g1501_1600.s1579_remove_max_number_of_edges_to_keep_graph_fully_traversable;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNumEdgesToRemove() {
        assertThat(
                new Solution()
                        .maxNumEdgesToRemove(
                                4,
                                new int[][] {
                                    {3, 1, 2}, {3, 2, 3}, {1, 1, 3}, {1, 2, 4}, {1, 1, 2}, {2, 3, 4}
                                }),
                equalTo(2));
    }

    @Test
    void maxNumEdgesToRemove2() {
        assertThat(
                new Solution()
                        .maxNumEdgesToRemove(
                                4, new int[][] {{3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}}),
                equalTo(0));
    }

    @Test
    void maxNumEdgesToRemove3() {
        assertThat(
                new Solution()
                        .maxNumEdgesToRemove(4, new int[][] {{3, 2, 3}, {1, 1, 2}, {2, 3, 4}}),
                equalTo(-1));
    }
}
