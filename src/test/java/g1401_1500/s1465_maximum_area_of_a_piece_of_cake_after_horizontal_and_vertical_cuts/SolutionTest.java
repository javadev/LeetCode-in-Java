package g1401_1500.s1465_maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxArea() {
        assertThat(new Solution().maxArea(5, 4, new int[] {1, 2, 4}, new int[] {1, 3}), equalTo(4));
    }

    @Test
    void maxArea2() {
        assertThat(new Solution().maxArea(5, 4, new int[] {3, 1}, new int[] {1}), equalTo(6));
    }

    @Test
    void maxArea3() {
        assertThat(new Solution().maxArea(5, 4, new int[] {3}, new int[] {3}), equalTo(9));
    }
}
