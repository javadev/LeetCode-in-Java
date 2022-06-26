package g0201_0300.s0223_rectangle_area;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rectangleArea() {
        assertThat(new Solution().computeArea(-3, 0, 3, 4, 0, -1, 9, 2), equalTo(45));
    }

    @Test
    void rectangleArea2() {
        assertThat(new Solution().computeArea(-2, -2, 2, 2, -2, -2, 2, 2), equalTo(16));
    }
}
