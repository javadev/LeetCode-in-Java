package g0801_0900.s0803_bricks_falling_when_hit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hitBricks() {
        assertThat(
                new Solution()
                        .hitBricks(new int[][] {{1, 0, 0, 0}, {1, 1, 1, 0}}, new int[][] {{1, 0}}),
                equalTo(new int[] {2}));
    }

    @Test
    void hitBricks2() {
        assertThat(
                new Solution()
                        .hitBricks(
                                new int[][] {{1, 0, 0, 0}, {1, 1, 0, 0}},
                                new int[][] {{1, 1}, {1, 0}}),
                equalTo(new int[] {0, 0}));
    }
}
