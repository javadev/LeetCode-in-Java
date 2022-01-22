package g0601_0700.s0684_redundant_connection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRedundantConnection() {
        assertThat(
                new Solution().findRedundantConnection(new int[][] {{1, 2}, {1, 3}, {2, 3}}),
                equalTo(new int[] {2, 3}));
    }

    @Test
    void findRedundantConnection2() {
        assertThat(
                new Solution()
                        .findRedundantConnection(
                                new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}),
                equalTo(new int[] {1, 4}));
    }
}
