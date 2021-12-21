package g0301_0400.s0391_perfect_rectangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isRectangleCover() {
        assertThat(
                new Solution()
                        .isRectangleCover(
                                new int[][] {
                                    {1, 1, 3, 3},
                                    {3, 1, 4, 2},
                                    {3, 2, 4, 4},
                                    {1, 3, 2, 4},
                                    {2, 3, 3, 4}
                                }),
                equalTo(true));
    }

    @Test
    void isRectangleCover2() {
        assertThat(
                new Solution()
                        .isRectangleCover(
                                new int[][] {
                                    {1, 1, 2, 3}, {1, 3, 2, 4}, {3, 1, 4, 2}, {3, 2, 4, 4}
                                }),
                equalTo(false));
    }

    @Test
    void isRectangleCover3() {
        assertThat(
                new Solution()
                        .isRectangleCover(
                                new int[][] {
                                    {1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {3, 2, 4, 4}
                                }),
                equalTo(false));
    }

    @Test
    void isRectangleCover4() {
        assertThat(
                new Solution()
                        .isRectangleCover(
                                new int[][] {
                                    {1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {2, 2, 4, 4}
                                }),
                equalTo(false));
    }
}
