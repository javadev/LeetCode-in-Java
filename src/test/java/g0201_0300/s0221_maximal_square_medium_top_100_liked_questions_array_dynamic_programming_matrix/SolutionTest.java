package g0201_0300.s0221_maximal_square_medium_top_100_liked_questions_array_dynamic_programming_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maximalSquare() {
        char[][] input = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        assertThat(new Solution().maximalSquare(input), equalTo(4));
    }
}
