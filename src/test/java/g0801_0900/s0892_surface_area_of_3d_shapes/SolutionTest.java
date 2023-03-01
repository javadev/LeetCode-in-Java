package g0801_0900.s0892_surface_area_of_3d_shapes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void surfaceArea() {
        assertThat(new Solution().surfaceArea(new int[][] {{1, 2}, {3, 4}}), equalTo(34));
    }

    @Test
    void surfaceArea2() {
        assertThat(
                new Solution().surfaceArea(new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}),
                equalTo(32));
    }

    @Test
    void surfaceArea3() {
        assertThat(
                new Solution().surfaceArea(new int[][] {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}),
                equalTo(46));
    }
}
