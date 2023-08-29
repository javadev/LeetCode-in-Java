package g0901_1000.s0976_largest_perimeter_triangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestPerimeter() {
        assertThat(new Solution().largestPerimeter(new int[] {2, 1, 2}), equalTo(5));
    }

    @Test
    void largestPerimeter2() {
        assertThat(new Solution().largestPerimeter(new int[] {1, 2, 1}), equalTo(0));
    }
}
