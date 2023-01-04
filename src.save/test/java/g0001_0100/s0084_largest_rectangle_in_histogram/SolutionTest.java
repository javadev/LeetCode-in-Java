package g0001_0100.s0084_largest_rectangle_in_histogram;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestRectangleArea() {
        assertThat(new Solution().largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}), equalTo(10));
    }

    @Test
    void largestRectangleArea2() {
        assertThat(new Solution().largestRectangleArea(new int[] {2, 4}), equalTo(4));
    }
}
