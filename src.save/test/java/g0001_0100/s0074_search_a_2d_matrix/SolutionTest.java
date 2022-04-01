package g0001_0100.s0074_search_a_2d_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void searchMatrix() {
        int[][] input = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        assertThat(new Solution().searchMatrix(input, 3), equalTo(true));
    }

    @Test
    void searchMatrix2() {
        int[][] input = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        assertThat(new Solution().searchMatrix(input, 13), equalTo(false));
    }
}
