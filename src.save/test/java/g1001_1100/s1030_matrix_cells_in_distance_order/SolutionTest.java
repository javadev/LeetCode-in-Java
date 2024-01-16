package g1001_1100.s1030_matrix_cells_in_distance_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void allCellsDistOrder() {
        assertThat(
                new Solution().allCellsDistOrder(1, 2, 0, 0),
                equalTo(new int[][] {{0, 0}, {0, 1}}));
    }

    @Test
    void allCellsDistOrder2() {
        assertThat(
                new Solution().allCellsDistOrder(2, 2, 0, 1),
                equalTo(new int[][] {{0, 1}, {0, 0}, {1, 1}, {1, 0}}));
    }

    @Test
    void allCellsDistOrder3() {
        assertThat(
                new Solution().allCellsDistOrder(2, 3, 1, 2),
                equalTo(new int[][] {{1, 2}, {0, 2}, {1, 1}, {0, 1}, {1, 0}, {0, 0}}));
    }
}
