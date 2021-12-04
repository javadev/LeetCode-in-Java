package g0101_0200.s0149_max_points_on_a_line;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void maxPoints() {
        int[][] input = {{1, 1}, {2, 2}, {3, 3}};
        assertThat(new Solution().maxPoints(input), equalTo(3));
    }
}
