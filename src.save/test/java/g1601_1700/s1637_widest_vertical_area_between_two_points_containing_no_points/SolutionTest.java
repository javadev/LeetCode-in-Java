package g1601_1700.s1637_widest_vertical_area_between_two_points_containing_no_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxWidthOfVerticalArea() {
        assertThat(
                new Solution().maxWidthOfVerticalArea(new int[][] {{8, 7}, {9, 9}, {7, 4}, {9, 7}}),
                equalTo(1));
    }

    @Test
    void maxWidthOfVerticalArea2() {
        assertThat(
                new Solution()
                        .maxWidthOfVerticalArea(
                                new int[][] {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}}),
                equalTo(3));
    }
}
