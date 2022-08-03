package g1901_2000.s1931_painting_a_grid_with_three_different_colors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void colorTheGrid() {
        assertThat(new Solution().colorTheGrid(1, 1), equalTo(3));
    }

    @Test
    void colorTheGrid2() {
        assertThat(new Solution().colorTheGrid(1, 2), equalTo(6));
    }

    @Test
    void colorTheGrid3() {
        assertThat(new Solution().colorTheGrid(5, 5), equalTo(580986));
    }
}
