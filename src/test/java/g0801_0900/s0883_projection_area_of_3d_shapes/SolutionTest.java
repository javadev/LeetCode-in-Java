package g0801_0900.s0883_projection_area_of_3d_shapes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void projectionArea() {
        assertThat(new Solution().projectionArea(new int[][] {{1, 2}, {3, 4}}), equalTo(17));
    }

    @Test
    void projectionArea2() {
        assertThat(new Solution().projectionArea(new int[][] {{2}}), equalTo(5));
    }

    @Test
    void projectionArea3() {
        assertThat(new Solution().projectionArea(new int[][] {{1, 0}, {0, 2}}), equalTo(8));
    }
}
