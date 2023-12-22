package g2801_2900.s2876_count_visited_nodes_in_a_directed_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countVisitedNodes() {
        assertThat(
                new Solution().countVisitedNodes(Arrays.asList(1, 2, 0, 0)),
                equalTo(new int[] {3, 3, 3, 4}));
    }

    @Test
    void countVisitedNodes2() {
        assertThat(
                new Solution().countVisitedNodes(Arrays.asList(1, 2, 3, 4, 0)),
                equalTo(new int[] {5, 5, 5, 5, 5}));
    }
}
