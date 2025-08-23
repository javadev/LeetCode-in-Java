package g3601_3700.s3655_xor_after_range_multiplication_queries_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void xorAfterQueries() {
        assertThat(
                new Solution().xorAfterQueries(new int[] {1, 1, 1}, new int[][] {{0, 2, 1, 4}}),
                equalTo(4));
    }

    @Test
    void xorAfterQueries2() {
        assertThat(
                new Solution()
                        .xorAfterQueries(
                                new int[] {2, 3, 1, 5, 4},
                                new int[][] {{1, 4, 2, 3}, {0, 2, 1, 2}}),
                equalTo(31));
    }

    @Test
    void xorAfterQueries3() {
        assertThat(
                new Solution()
                        .xorAfterQueries(
                                new int[] {329, 112, 80},
                                new int[][] {
                                    {2, 2, 2, 20},
                                    {0, 2, 1, 19},
                                    {0, 2, 3, 9},
                                    {1, 2, 1, 11},
                                    {2, 2, 1, 11},
                                    {0, 2, 2, 11},
                                    {1, 1, 2, 2},
                                    {0, 1, 1, 14},
                                    {1, 2, 3, 8},
                                    {2, 2, 1, 14},
                                    {2, 2, 3, 10},
                                    {2, 2, 3, 1},
                                    {1, 1, 2, 12},
                                    {0, 2, 1, 15},
                                    {0, 2, 1, 3},
                                    {1, 1, 3, 15},
                                    {1, 1, 2, 2}
                                }),
                equalTo(426005772));
    }
}
