package g0401_0500.s0427_construct_quad_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void construct() {
        assertThat(
                new Solution().construct(new int[][] {{0, 1}, {1, 0}}).toString(),
                equalTo("[0,1][1,0][1,1][1,1][1,0]"));
    }

    @Test
    void construct2() {
        assertThat(
                new Solution()
                        .construct(
                                new int[][] {
                                    {1, 1, 1, 1, 0, 0, 0, 0},
                                    {1, 1, 1, 1, 0, 0, 0, 0},
                                    {1, 1, 1, 1, 1, 1, 1, 1},
                                    {1, 1, 1, 1, 1, 1, 1, 1},
                                    {1, 1, 1, 1, 0, 0, 0, 0},
                                    {1, 1, 1, 1, 0, 0, 0, 0},
                                    {1, 1, 1, 1, 0, 0, 0, 0},
                                    {1, 1, 1, 1, 0, 0, 0, 0}
                                })
                        .toString(),
                equalTo("[0,1][1,1][0,1][1,1][1,0]"));
    }
}
