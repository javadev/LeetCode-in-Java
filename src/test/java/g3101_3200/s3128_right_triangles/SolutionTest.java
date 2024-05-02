package g3101_3200.s3128_right_triangles;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfRightTriangles() {
        assertThat(
                new Solution()
                        .numberOfRightTriangles(new int[][] {{0, 1, 0}, {0, 1, 1}, {0, 1, 0}}),
                equalTo(2L));
    }

    @Test
    void numberOfRightTriangles2() {
        assertThat(
                new Solution()
                        .numberOfRightTriangles(
                                new int[][] {{1, 0, 0, 0}, {0, 1, 0, 1}, {1, 0, 0, 0}}),
                equalTo(0L));
    }

    @Test
    void numberOfRightTriangles3() {
        assertThat(
                new Solution()
                        .numberOfRightTriangles(new int[][] {{1, 0, 1}, {1, 0, 0}, {1, 0, 0}}),
                equalTo(2L));
    }
}
