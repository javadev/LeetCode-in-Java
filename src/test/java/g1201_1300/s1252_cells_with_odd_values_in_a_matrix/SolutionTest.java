package g1201_1300.s1252_cells_with_odd_values_in_a_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void oddCells() {
        assertThat(new Solution().oddCells(2, 3, new int[][] {{0, 1}, {1, 1}}), equalTo(6));
    }

    @Test
    void oddCells2() {
        assertThat(new Solution().oddCells(2, 2, new int[][] {{1, 1}, {0, 0}}), equalTo(0));
    }
}
