package g1701_1800.s1706_where_will_the_ball_fall;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findBall() {
        assertThat(
                new Solution()
                        .findBall(
                                new int[][] {
                                    {1, 1, 1, -1, -1},
                                    {1, 1, 1, -1, -1},
                                    {-1, -1, -1, 1, 1},
                                    {1, 1, 1, 1, -1},
                                    {-1, -1, -1, -1, -1}
                                }),
                equalTo(new int[] {1, -1, -1, -1, -1}));
    }

    @Test
    void findBall2() {
        assertThat(new Solution().findBall(new int[][] {{-1}}), equalTo(new int[] {-1}));
    }

    @Test
    void findBall3() {
        assertThat(
                new Solution()
                        .findBall(
                                new int[][] {
                                    {1, 1, 1, 1, 1, 1},
                                    {-1, -1, -1, -1, -1, -1},
                                    {1, 1, 1, 1, 1, 1},
                                    {-1, -1, -1, -1, -1, -1}
                                }),
                equalTo(new int[] {0, 1, 2, 3, 4, -1}));
    }
}
