package g0801_0900.s0847_shortest_path_visiting_all_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestPathLength() {
        assertThat(
                new Solution().shortestPathLength(new int[][] {{1, 2, 3}, {0}, {0}, {0}}),
                equalTo(4));
    }

    @Test
    void shortestPathLength2() {
        assertThat(
                new Solution()
                        .shortestPathLength(new int[][] {{1}, {0, 2, 3}, {1, 3, 4}, {2}, {1, 2}}),
                equalTo(4));
    }
}
