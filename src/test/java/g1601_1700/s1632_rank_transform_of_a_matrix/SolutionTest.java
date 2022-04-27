package g1601_1700.s1632_rank_transform_of_a_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void matrixRankTransform() {
        assertThat(
                new Solution().matrixRankTransform(new int[][] {{1, 2}, {3, 4}}),
                equalTo(new int[][] {{1, 2}, {2, 3}}));
    }

    @Test
    void matrixRankTransform2() {
        assertThat(
                new Solution().matrixRankTransform(new int[][] {{7, 7}, {7, 7}}),
                equalTo(new int[][] {{1, 1}, {1, 1}}));
    }

    @Test
    void matrixRankTransform3() {
        assertThat(
                new Solution()
                        .matrixRankTransform(
                                new int[][] {
                                    {20, -21, 14}, {-19, 4, 19}, {22, -47, 24}, {-19, 4, 19}
                                }),
                equalTo(new int[][] {{4, 2, 3}, {1, 3, 4}, {5, 1, 6}, {1, 3, 4}}));
    }
}
