package g3101_3200.s3111_minimum_rectangles_to_cover_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minRectanglesToCoverPoints() {
        assertThat(
                new Solution()
                        .minRectanglesToCoverPoints(
                                new int[][] {{2, 1}, {1, 0}, {1, 4}, {1, 8}, {3, 5}, {4, 6}}, 1),
                equalTo(2));
    }

    @Test
    void minRectanglesToCoverPoints2() {
        assertThat(
                new Solution()
                        .minRectanglesToCoverPoints(
                                new int[][] {
                                    {0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}
                                },
                                2),
                equalTo(3));
    }

    @Test
    void minRectanglesToCoverPoints3() {
        assertThat(
                new Solution().minRectanglesToCoverPoints(new int[][] {{2, 3}, {1, 2}}, 0),
                equalTo(2));
    }
}
