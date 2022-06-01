package g0101_0200.s0149_max_points_on_a_line;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPoints() {
        int[][] input = {{1, 1}, {2, 2}, {3, 3}};
        assertThat(new Solution().maxPoints(input), equalTo(3));
    }

    @Test
    void maxPoints2() {
        int[][] input = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        assertThat(new Solution().maxPoints(input), equalTo(4));
    }
}
