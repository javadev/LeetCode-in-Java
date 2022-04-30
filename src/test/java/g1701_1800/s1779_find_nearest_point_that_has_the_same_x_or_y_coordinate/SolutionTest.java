package g1701_1800.s1779_find_nearest_point_that_has_the_same_x_or_y_coordinate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nearestValidPoint() {
        assertThat(
                new Solution()
                        .nearestValidPoint(
                                3, 4, new int[][] {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}}),
                equalTo(2));
    }

    @Test
    void nearestValidPoint2() {
        assertThat(new Solution().nearestValidPoint(3, 4, new int[][] {{3, 4}}), equalTo(0));
    }

    @Test
    void nearestValidPoint3() {
        assertThat(new Solution().nearestValidPoint(3, 4, new int[][] {{2, 3}}), equalTo(-1));
    }
}
