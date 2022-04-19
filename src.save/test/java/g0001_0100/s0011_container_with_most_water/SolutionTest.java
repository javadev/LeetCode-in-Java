package g0001_0100.s0011_container_with_most_water;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxArea() {
        assertThat(new Solution().maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}), equalTo(49));
    }

    @Test
    void maxArea2() {
        assertThat(new Solution().maxArea(new int[] {1, 1}), equalTo(1));
    }
}
