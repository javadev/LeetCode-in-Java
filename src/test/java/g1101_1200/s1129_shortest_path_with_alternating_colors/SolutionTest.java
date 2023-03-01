package g1101_1200.s1129_shortest_path_with_alternating_colors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestAlternatingPaths() {
        assertThat(
                new Solution()
                        .shortestAlternatingPaths(3, new int[][] {{0, 1}, {1, 2}}, new int[][] {}),
                equalTo(new int[] {0, 1, -1}));
    }

    @Test
    void shortestAlternatingPaths2() {
        assertThat(
                new Solution()
                        .shortestAlternatingPaths(3, new int[][] {{0, 1}}, new int[][] {{2, 1}}),
                equalTo(new int[] {0, 1, -1}));
    }
}
