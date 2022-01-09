package g0501_0600.s0587_erect_the_fence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void outerTrees() {
        assertThat(
                new Solution()
                        .outerTrees(new int[][] {{1, 1}, {2, 2}, {2, 0}, {2, 4}, {3, 3}, {4, 2}}),
                equalTo(new int[][] {{1, 1}, {2, 0}, {4, 2}, {3, 3}, {2, 4}}));
    }

    @Test
    void outerTrees2() {
        assertThat(
                new Solution().outerTrees(new int[][] {{1, 2}, {2, 2}, {4, 2}}),
                equalTo(new int[][] {{1, 2}, {2, 2}, {4, 2}}));
    }
}
