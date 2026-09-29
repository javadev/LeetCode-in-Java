package g3901_4000.s3938_maximum_path_intersection_sum_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(
                new Solution()
                        .maxScore(
                                new int[][] {
                                    {1, 2, 0, -3},
                                    {1, -2, 1, 0},
                                    {-4, 2, -1, 3},
                                    {3, -3, 3, -2},
                                    {-1, -5, 0, 1}
                                }),
                equalTo(4));
    }

    @Test
    void maxScore2() {
        assertThat(
                new Solution().maxScore(new int[][] {{4, -2, -3}, {-1, -3, -1}, {-4, 2, -1}}),
                equalTo(3));
    }

    @Test
    void maxScore3() {
        assertThat(new Solution().maxScore(new int[][] {{-1, -2}, {-3, -4}}), equalTo(-3));
    }

    @Test
    void maxScore4() {
        assertThat(
                new Solution()
                        .maxScore(
                                new int[][] {
                                    {-100, -100, -100}, {-100, -1, -100}, {-100, -100, -100}
                                }),
                equalTo(-1));
    }

    @Test
    void maxScore5() {
        assertThat(new Solution().maxScore(new int[][] {{1, 2}, {3, 4}}), equalTo(7));
    }

    @Test
    void maxScore6() {
        assertThat(new Solution().maxScore(new int[][] {{0, 0}, {0, 0}}), equalTo(0));
    }

    @Test
    void maxScore7() {
        assertThat(
                new Solution().maxScore(new int[][] {{5, -100}, {5, -100}, {5, -100}}),
                equalTo(15));
    }
}
