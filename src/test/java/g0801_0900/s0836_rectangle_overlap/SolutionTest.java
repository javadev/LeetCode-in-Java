package g0801_0900.s0836_rectangle_overlap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isRectangleOverlap() {
        assertThat(
                new Solution().isRectangleOverlap(new int[] {0, 0, 2, 2}, new int[] {1, 1, 3, 3}),
                equalTo(true));
    }

    @Test
    void isRectangleOverlap2() {
        assertThat(
                new Solution().isRectangleOverlap(new int[] {0, 0, 1, 1}, new int[] {1, 0, 2, 1}),
                equalTo(false));
    }

    @Test
    void isRectangleOverlap3() {
        assertThat(
                new Solution().isRectangleOverlap(new int[] {0, 0, 1, 1}, new int[] {2, 2, 3, 3}),
                equalTo(false));
    }
}
