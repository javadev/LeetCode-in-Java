package g3301_3400.s3332_maximum_points_tourist_can_earn;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(
                new Solution().maxScore(2, 1, new int[][] {{2, 3}}, new int[][] {{0, 2}, {1, 0}}),
                equalTo(3));
    }

    @Test
    void maxScore2() {
        assertThat(
                new Solution()
                        .maxScore(
                                3,
                                2,
                                new int[][] {{3, 4, 2}, {2, 1, 2}},
                                new int[][] {{0, 2, 1}, {2, 0, 4}, {3, 2, 0}}),
                equalTo(8));
    }
}
