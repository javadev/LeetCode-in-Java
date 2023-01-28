package g1901_2000.s1905_count_sub_islands;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubIslands() {
        assertThat(
                new Solution()
                        .countSubIslands(
                                new int[][] {
                                    {1, 1, 1, 0, 0},
                                    {0, 1, 1, 1, 1},
                                    {0, 0, 0, 0, 0},
                                    {1, 0, 0, 0, 0},
                                    {1, 1, 0, 1, 1}
                                },
                                new int[][] {
                                    {1, 1, 1, 0, 0},
                                    {0, 0, 1, 1, 1},
                                    {0, 1, 0, 0, 0},
                                    {1, 0, 1, 1, 0},
                                    {0, 1, 0, 1, 0}
                                }),
                equalTo(3));
    }

    @Test
    void countSubIslands2() {
        assertThat(
                new Solution()
                        .countSubIslands(
                                new int[][] {
                                    {1, 0, 1, 0, 1},
                                    {1, 1, 1, 1, 1},
                                    {0, 0, 0, 0, 0},
                                    {1, 1, 1, 1, 1},
                                    {1, 0, 1, 0, 1}
                                },
                                new int[][] {
                                    {0, 0, 0, 0, 0},
                                    {1, 1, 1, 1, 1},
                                    {0, 1, 0, 1, 0},
                                    {0, 1, 0, 1, 0},
                                    {1, 0, 0, 0, 1}
                                }),
                equalTo(2));
    }
}
