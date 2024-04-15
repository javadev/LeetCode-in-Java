package g2901_3000.s2943_maximize_area_of_square_hole_in_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeSquareHoleArea() {
        assertThat(
                new Solution().maximizeSquareHoleArea(2, 1, new int[] {2, 3}, new int[] {2}),
                equalTo(4));
    }

    @Test
    void maximizeSquareHoleArea2() {
        assertThat(
                new Solution().maximizeSquareHoleArea(1, 1, new int[] {2}, new int[] {2}),
                equalTo(4));
    }

    @Test
    void maximizeSquareHoleArea3() {
        assertThat(
                new Solution().maximizeSquareHoleArea(2, 3, new int[] {2, 3}, new int[] {2, 3, 4}),
                equalTo(9));
    }
}
