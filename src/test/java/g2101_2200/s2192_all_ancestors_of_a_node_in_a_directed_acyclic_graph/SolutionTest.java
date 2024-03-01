package g2101_2200.s2192_all_ancestors_of_a_node_in_a_directed_acyclic_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getAncestors() {
        int[][] edges = {{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}};
        int[][] expected = {{}, {}, {}, {0, 1}, {0, 2}, {0, 1, 3}, {0, 1, 2, 3, 4}, {0, 1, 2, 3}};
        assertThat(new Solution().getAncestors(8, edges), equalTo(ArrayUtils.getLists(expected)));
    }

    @Test
    void getAncestors2() {
        int[][] edges = {
            {0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}
        };
        int[][] expected = {{}, {0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}, {}, {}, {}};
        assertThat(new Solution().getAncestors(8, edges), equalTo(ArrayUtils.getLists(expected)));
    }
}
