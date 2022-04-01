package g0701_0800.s0785_is_graph_bipartite;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isBipartite() {
        assertThat(
                new Solution().isBipartite(new int[][] {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}),
                equalTo(false));
    }

    @Test
    void isBipartite2() {
        assertThat(
                new Solution().isBipartite(new int[][] {{1, 3}, {0, 2}, {1, 3}, {0, 2}}),
                equalTo(true));
    }
}
