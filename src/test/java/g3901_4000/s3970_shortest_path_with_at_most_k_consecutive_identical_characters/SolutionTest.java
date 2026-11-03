package g3901_4000.s3970_shortest_path_with_at_most_k_consecutive_identical_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestPath() {
        assertThat(
                new Solution()
                        .shortestPath(3, new int[][] {{0, 1, 1}, {1, 2, 1}, {0, 2, 3}}, "aab", 1),
                equalTo(3));
    }

    @Test
    void shortestPath2() {
        assertThat(
                new Solution()
                        .shortestPath(3, new int[][] {{0, 1, 1}, {1, 2, 1}, {0, 2, 3}}, "aab", 2),
                equalTo(2));
    }

    @Test
    void shortestPath3() {
        assertThat(
                new Solution().shortestPath(3, new int[][] {{0, 1, 1}, {1, 2, 1}}, "aaa", 2),
                equalTo(-1));
    }
}
