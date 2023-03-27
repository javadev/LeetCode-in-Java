package g0801_0900.s0827_making_a_large_island;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestIsland() {
        assertThat(new Solution().largestIsland(new int[][] {{1, 0}, {0, 1}}), equalTo(3));
    }

    @Test
    void largestIsland2() {
        assertThat(new Solution().largestIsland(new int[][] {{1, 1}, {1, 0}}), equalTo(4));
    }

    @Test
    void largestIsland3() {
        assertThat(new Solution().largestIsland(new int[][] {{1, 1}, {1, 0}}), equalTo(4));
    }
}
