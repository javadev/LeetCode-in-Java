package g2701_2800.s2713_maximum_strictly_increasing_cells_in_a_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxIncreasingCells() {
        assertThat(new Solution().maxIncreasingCells(new int[][] {{3, 1}, {3, 4}}), equalTo(2));
    }

    @Test
    void maxIncreasingCells2() {
        assertThat(new Solution().maxIncreasingCells(new int[][] {{1, 1}, {1, 1}}), equalTo(1));
    }

    @Test
    void maxIncreasingCells3() {
        assertThat(
                new Solution().maxIncreasingCells(new int[][] {{3, 1, 6}, {-9, 5, 7}}), equalTo(4));
    }
}
