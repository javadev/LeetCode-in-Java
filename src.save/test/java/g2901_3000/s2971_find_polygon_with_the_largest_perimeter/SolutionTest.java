package g2901_3000.s2971_find_polygon_with_the_largest_perimeter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestPerimeter() {
        assertThat(new Solution().largestPerimeter(new int[] {5, 5, 5}), equalTo(15L));
    }

    @Test
    void largestPerimeter2() {
        assertThat(
                new Solution().largestPerimeter(new int[] {1, 12, 1, 2, 5, 50, 3}), equalTo(12L));
    }

    @Test
    void largestPerimeter3() {
        assertThat(new Solution().largestPerimeter(new int[] {5, 5, 50}), equalTo(-1L));
    }
}
