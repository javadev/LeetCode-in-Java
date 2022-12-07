package g0901_1000.s0934_shortest_bridge;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestBridge() {
        assertThat(new Solution().shortestBridge(new int[][] {{0, 1}, {1, 0}}), equalTo(1));
    }

    @Test
    void shortestBridge2() {
        assertThat(
                new Solution().shortestBridge(new int[][] {{0, 1, 0}, {0, 0, 0}, {0, 0, 1}}),
                equalTo(2));
    }

    @Test
    void shortestBridge3() {
        assertThat(
                new Solution()
                        .shortestBridge(
                                new int[][] {
                                    {1, 1, 1, 1, 1},
                                    {1, 0, 0, 0, 1},
                                    {1, 0, 1, 0, 1},
                                    {1, 0, 0, 0, 1},
                                    {1, 1, 1, 1, 1}
                                }),
                equalTo(1));
    }
}
