package g0001_0100.s0072_edit_distance_hard_top_100_liked_questions_string_dynamic_programming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void minDistance() {
        assertThat(new Solution().minDistance("horse", "ros"), equalTo(3));
    }
}
