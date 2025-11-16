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

    @Test
    void largestRectangleArea3() {
        assertThat(new Solution().largestRectangleArea(new int[] {}), equalTo(0));
    }

    @Test
    void largestRectangleArea4() {
        assertThat(new Solution().largestRectangleArea(new int[] {5}), equalTo(5));
    }

    @Test
    void largestRectangleArea5() {
        assertThat(new Solution().largestRectangleArea(new int[] {3, 6}), equalTo(6));
    }

    @Test
    void largestRectangleArea6() {
        assertThat(new Solution().largestRectangleArea(new int[] {2, 2, 2, 2}), equalTo(8));
    }

    @Test
    void largestRectangleArea7() {
        assertThat(new Solution().largestRectangleArea(new int[] {1, 2, 3, 4, 5}), equalTo(9));
    }

    @Test
    void largestRectangleArea8() {
        assertThat(new Solution().largestRectangleArea(new int[] {5, 4, 3, 2, 1}), equalTo(9));
    }

    @Test
    void largestRectangleArea9() {
        assertThat(new Solution().largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}), equalTo(10));
    }

    @Test
    void largestRectangleArea10() {
        assertThat(new Solution().largestRectangleArea(new int[] {1, 1, 1, 1}), equalTo(4));
    }
}
