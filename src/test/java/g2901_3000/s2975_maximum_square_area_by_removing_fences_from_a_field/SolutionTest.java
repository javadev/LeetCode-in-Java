package g2901_3000.s2975_maximum_square_area_by_removing_fences_from_a_field;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeSquareArea() {
        assertThat(
                new Solution().maximizeSquareArea(4, 3, new int[] {2, 3}, new int[] {2}),
                equalTo(4));
    }

    @Test
    void maximizeSquareArea2() {
        assertThat(
                new Solution().maximizeSquareArea(6, 7, new int[] {2}, new int[] {4}), equalTo(-1));
    }
}
