package g1901_2000.s1971_find_if_path_exists_in_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validPath() {
        assertThat(
                new Solution().validPath(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, 0, 2),
                equalTo(true));
    }

    @Test
    void validPath2() {
        assertThat(
                new Solution()
                        .validPath(6, new int[][] {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5),
                equalTo(false));
    }
}
