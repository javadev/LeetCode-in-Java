package g0001_0100.s0084_largest_rectangle_in_histogram;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void largestRectangleArea() {
        assertThat(new Solution().largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}), equalTo(10));
    }
}
