package g2301_2400.s2397_maximum_rows_covered_by_columns;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumRows() {
        assertThat(
                new Solution()
                        .maximumRows(new int[][] {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 0, 1}}, 2),
                equalTo(3));
    }

    @Test
    void maximumRows2() {
        assertThat(new Solution().maximumRows(new int[][] {{1}, {0}}, 1), equalTo(2));
    }
}
