package g0701_0800.s0789_escape_the_ghosts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void escapeGhosts() {
        assertThat(
                new Solution().escapeGhosts(new int[][] {{1, 0}, {0, 3}}, new int[] {0, 1}),
                equalTo(true));
    }

    @Test
    void escapeGhosts2() {
        assertThat(
                new Solution().escapeGhosts(new int[][] {{1, 0}}, new int[] {2, 0}),
                equalTo(false));
    }

    @Test
    void escapeGhosts3() {
        assertThat(
                new Solution().escapeGhosts(new int[][] {{2, 0}}, new int[] {1, 0}),
                equalTo(false));
    }
}
