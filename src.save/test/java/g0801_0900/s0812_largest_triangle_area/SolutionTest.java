package g0801_0900.s0812_largest_triangle_area;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestTriangleArea() {
        assertThat(
                new Solution()
                        .largestTriangleArea(new int[][] {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}),
                equalTo(2.0));
    }

    @Test
    void largestTriangleArea2() {
        assertThat(
                new Solution().largestTriangleArea(new int[][] {{1, 0}, {0, 0}, {0, 1}}),
                equalTo(0.5));
    }
}
