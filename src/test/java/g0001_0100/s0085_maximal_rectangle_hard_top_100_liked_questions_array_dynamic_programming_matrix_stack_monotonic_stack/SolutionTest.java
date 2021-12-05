package g0001_0100.s0085_maximal_rectangle_hard_top_100_liked_questions_array_dynamic_programming_matrix_stack_monotonic_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maximalRectangle() {
        char[][] array = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        assertThat(new Solution().maximalRectangle(array), equalTo(6));
    }
}
