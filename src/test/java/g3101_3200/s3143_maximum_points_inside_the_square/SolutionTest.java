package g3101_3200.s3143_maximum_points_inside_the_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPointsInsideSquare() {
        assertThat(
                new Solution()
                        .maxPointsInsideSquare(
                                new int[][] {{2, 2}, {-1, -2}, {-4, 4}, {-3, 1}, {3, -3}}, "abdca"),
                equalTo(2));
    }

    @Test
    void maxPointsInsideSquare2() {
        assertThat(
                new Solution()
                        .maxPointsInsideSquare(new int[][] {{1, 1}, {-2, -2}, {-2, 2}}, "abb"),
                equalTo(1));
    }
}
