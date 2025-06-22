package g3501_3600.s3588_find_maximum_area_of_a_triangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxArea() {
        assertThat(
                new Solution().maxArea(new int[][] {{1, 1}, {1, 2}, {3, 2}, {3, 3}}), equalTo(2L));
    }

    @Test
    void maxArea2() {
        assertThat(new Solution().maxArea(new int[][] {{1, 1}, {2, 2}, {3, 3}}), equalTo(-1L));
    }
}
