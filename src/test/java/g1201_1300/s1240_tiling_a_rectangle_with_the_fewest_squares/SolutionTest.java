package g1201_1300.s1240_tiling_a_rectangle_with_the_fewest_squares;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void tilingRectangle() {
        assertThat(new Solution().tilingRectangle(2, 3), equalTo(3));
    }

    @Test
    void tilingRectangle2() {
        assertThat(new Solution().tilingRectangle(5, 8), equalTo(5));
    }

    @Test
    void tilingRectangle3() {
        assertThat(new Solution().tilingRectangle(11, 13), equalTo(6));
    }
}
