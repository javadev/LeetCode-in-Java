package g2501_2600.s2536_increment_submatrices_by_one;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rangeAddQueries() {
        assertThat(
                new Solution().rangeAddQueries(3, new int[][] {{1, 1, 2, 2}, {0, 0, 1, 1}}),
                equalTo(new int[][] {{1, 1, 0}, {1, 2, 1}, {0, 1, 1}}));
    }

    @Test
    void rangeAddQueries2() {
        assertThat(
                new Solution().rangeAddQueries(2, new int[][] {{0, 0, 1, 1}}),
                equalTo(new int[][] {{1, 1}, {1, 1}}));
    }
}
