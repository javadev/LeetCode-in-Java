package g1001_1100.s1091_shortest_path_in_binary_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestPathBinaryMatrix() {
        assertThat(
                new Solution().shortestPathBinaryMatrix(new int[][] {{0, 1}, {1, 0}}), equalTo(2));
    }

    @Test
    void shortestPathBinaryMatrix2() {
        assertThat(
                new Solution()
                        .shortestPathBinaryMatrix(new int[][] {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}),
                equalTo(4));
    }

    @Test
    void shortestPathBinaryMatrix3() {
        assertThat(
                new Solution()
                        .shortestPathBinaryMatrix(new int[][] {{1, 0, 0}, {1, 1, 0}, {1, 1, 0}}),
                equalTo(-1));
    }
}
