package g3501_3600.s3537_fill_a_special_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void specialGrid() {
        assertThat(new Solution().specialGrid(0), equalTo(new int[][] {{0}}));
    }

    @Test
    void specialGrid2() {
        assertThat(new Solution().specialGrid(1), equalTo(new int[][] {{3, 0}, {2, 1}}));
    }

    @Test
    void specialGrid3() {
        assertThat(
                new Solution().specialGrid(2),
                equalTo(
                        new int[][] {
                            {15, 12, 3, 0}, {14, 13, 2, 1}, {11, 8, 7, 4}, {10, 9, 6, 5}
                        }));
    }
}
