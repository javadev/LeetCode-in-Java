package g0201_0300.s0223_rectangle_area;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void rectangleArea() {
        assertThat(new Solution().computeArea(-3, 0, 3, 4, 0, -1, 9, 2), equalTo(45));
    }
}
