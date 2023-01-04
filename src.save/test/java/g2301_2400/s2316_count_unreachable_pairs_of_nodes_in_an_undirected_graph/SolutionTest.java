package g2301_2400.s2316_count_unreachable_pairs_of_nodes_in_an_undirected_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(new Solution().countPairs(3, new int[][] {{0, 1}, {0, 2}, {1, 2}}), equalTo(0L));
    }

    @Test
    void countPairs2() {
        assertThat(
                new Solution().countPairs(7, new int[][] {{0, 2}, {0, 5}, {2, 4}, {1, 6}, {5, 4}}),
                equalTo(14L));
    }
}
