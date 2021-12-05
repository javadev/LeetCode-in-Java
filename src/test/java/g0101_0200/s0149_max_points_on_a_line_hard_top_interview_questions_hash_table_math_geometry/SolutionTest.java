package g0101_0200.s0149_max_points_on_a_line_hard_top_interview_questions_hash_table_math_geometry;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxPoints() {
        int[][] input = {{1, 1}, {2, 2}, {3, 3}};
        assertThat(new Solution().maxPoints(input), equalTo(3));
    }
}
