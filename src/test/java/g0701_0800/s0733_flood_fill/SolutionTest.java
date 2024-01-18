package g0701_0800.s0733_flood_fill;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void floodFill() {
        assertThat(
                new Solution().floodFill(new int[][] {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2),
                equalTo(new int[][] {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}));
    }

    @Test
    void floodFill2() {
        assertThat(
                new Solution().floodFill(new int[][] {{0, 0, 0}, {0, 0, 0}}, 1, 1, 2),
                equalTo(new int[][] {{2, 2, 2}, {2, 2, 2}}));
    }
}
