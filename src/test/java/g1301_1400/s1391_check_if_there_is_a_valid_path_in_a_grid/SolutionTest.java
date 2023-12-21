package g1301_1400.s1391_check_if_there_is_a_valid_path_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasValidPath() {
        assertThat(new Solution().hasValidPath(new int[][] {{2, 4, 3}, {6, 5, 2}}), equalTo(true));
    }

    @Test
    void hasValidPath2() {
        assertThat(new Solution().hasValidPath(new int[][] {{1, 2, 1}, {1, 2, 1}}), equalTo(false));
    }

    @Test
    void hasValidPath3() {
        assertThat(new Solution().hasValidPath(new int[][] {{1, 1, 2}}), equalTo(false));
    }
}
