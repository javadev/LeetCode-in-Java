package g0301_0400.s0329_longest_increasing_path_in_a_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestIncreasingPath() {
        assertThat(
                new Solution().longestIncreasingPath(new int[][] {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}}),
                equalTo(4));
    }

    @Test
    void longestIncreasingPath2() {
        assertThat(
                new Solution().longestIncreasingPath(new int[][] {{3, 4, 5}, {3, 2, 6}, {2, 2, 1}}),
                equalTo(4));
    }
}
