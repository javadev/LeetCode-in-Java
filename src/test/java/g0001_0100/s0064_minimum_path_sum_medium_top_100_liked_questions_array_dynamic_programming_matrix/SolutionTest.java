package g0001_0100.s0064_minimum_path_sum_medium_top_100_liked_questions_array_dynamic_programming_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void minPathSum() {
        int[][] expected = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertThat(new Solution().minPathSum(expected), equalTo(7));
    }
}
