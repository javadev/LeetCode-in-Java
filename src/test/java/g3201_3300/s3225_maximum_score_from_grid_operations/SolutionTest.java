package g3201_3300.s3225_maximum_score_from_grid_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScore() {
        assertThat(
                new Solution()
                        .maximumScore(
                                new int[][] {
                                    {0, 0, 0, 0, 0},
                                    {0, 0, 3, 0, 0},
                                    {0, 1, 0, 0, 0},
                                    {5, 0, 0, 3, 0},
                                    {0, 0, 0, 0, 2}
                                }),
                equalTo(11L));
    }

    @Test
    void maximumScore2() {
        assertThat(
                new Solution()
                        .maximumScore(
                                new int[][] {
                                    {10, 9, 0, 0, 15},
                                    {7, 1, 0, 8, 0},
                                    {5, 20, 0, 11, 0},
                                    {0, 0, 0, 1, 2},
                                    {8, 12, 1, 10, 3}
                                }),
                equalTo(94L));
    }
}
