package g3301_3400.s3311_construct_2d_grid_matching_graph_layout;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructGridLayout() {
        assertThat(
                new Solution().constructGridLayout(4, new int[][] {{0, 1}, {0, 2}, {1, 3}, {2, 3}}),
                equalTo(new int[][] {{0, 2}, {1, 3}}));
    }

    @Test
    void constructGridLayout2() {
        assertThat(
                new Solution().constructGridLayout(5, new int[][] {{0, 1}, {1, 3}, {2, 3}, {2, 4}}),
                equalTo(new int[][] {{0, 1, 3, 2, 4}}));
    }

    @Test
    void constructGridLayout3() {
        assertThat(
                new Solution()
                        .constructGridLayout(
                                9,
                                new int[][] {
                                    {0, 1}, {0, 4}, {0, 5}, {1, 7}, {2, 3}, {2, 4}, {2, 5}, {3, 6},
                                    {4, 6}, {4, 7}, {6, 8}, {7, 8}
                                }),
                equalTo(new int[][] {{1, 0, 5}, {7, 4, 2}, {8, 6, 3}}));
    }
}
