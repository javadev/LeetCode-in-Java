package g0001_0100.s0074_search_a_2d_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void searchMatrix() {
        assertThat(
                new Solution()
                        .searchMatrix(
                                new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3),
                equalTo(true));
    }
}
