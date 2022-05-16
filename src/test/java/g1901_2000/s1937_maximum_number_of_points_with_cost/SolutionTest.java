package g1901_2000.s1937_maximum_number_of_points_with_cost;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPoints() {
        assertThat(
                new Solution().maxPoints(new int[][] {{1, 2, 3}, {1, 5, 1}, {3, 1, 1}}),
                equalTo(9L));
    }

    @Test
    void maxPoints2() {
        assertThat(new Solution().maxPoints(new int[][] {{1, 5}, {2, 3}, {4, 2}}), equalTo(11L));
    }
}
