package g3301_3400.s3382_maximum_area_rectangle_with_point_constraints_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxRectangleArea() {
        assertThat(
                new Solution().maxRectangleArea(new int[] {1, 1, 3, 3}, new int[] {1, 3, 1, 3}),
                equalTo(4L));
    }

    @Test
    void maxRectangleArea2() {
        assertThat(
                new Solution()
                        .maxRectangleArea(new int[] {1, 1, 3, 3, 2}, new int[] {1, 3, 1, 3, 2}),
                equalTo(-1L));
    }

    @Test
    void maxRectangleArea3() {
        assertThat(
                new Solution()
                        .maxRectangleArea(
                                new int[] {1, 1, 3, 3, 1, 3}, new int[] {1, 3, 1, 3, 2, 2}),
                equalTo(2L));
    }
}
