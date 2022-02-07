package g0801_0900.s0850_rectangle_area_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rectangleArea() {
        assertThat(
                new Solution()
                        .rectangleArea(new int[][] {{0, 0, 2, 2}, {1, 0, 2, 3}, {1, 0, 3, 1}}),
                equalTo(6));
    }

    @Test
    void rectangleArea2() {
        assertThat(
                new Solution().rectangleArea(new int[][] {{0, 0, 1000000000, 1000000000}}),
                equalTo(49));
    }
}
