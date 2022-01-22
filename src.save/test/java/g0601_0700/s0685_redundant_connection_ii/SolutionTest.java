package g0601_0700.s0685_redundant_connection_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRedundantDirectedConnection() {
        assertThat(
                new Solution()
                        .findRedundantDirectedConnection(new int[][] {{1, 2}, {1, 3}, {2, 3}}),
                equalTo(new int[] {2, 3}));
    }

    @Test
    void findRedundantDirectedConnection2() {
        assertThat(
                new Solution()
                        .findRedundantDirectedConnection(
                                new int[][] {{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 5}}),
                equalTo(new int[] {4, 1}));
    }
}
