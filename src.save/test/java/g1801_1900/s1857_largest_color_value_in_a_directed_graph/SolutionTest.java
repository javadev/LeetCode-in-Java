package g1801_1900.s1857_largest_color_value_in_a_directed_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestPathValue() {
        assertThat(
                new Solution()
                        .largestPathValue("abaca", new int[][] {{0, 1}, {0, 2}, {2, 3}, {3, 4}}),
                equalTo(3));
    }

    @Test
    void largestPathValue2() {
        assertThat(new Solution().largestPathValue("a", new int[][] {{0, 0}}), equalTo(-1));
    }
}
