package g3901_4000.s3989_maximum_consistent_columns_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxConsistentColumns() {
        assertThat(new Solution().maxConsistentColumns(new int[][] {{-2, 0, 3}}, 2), equalTo(2));
    }

    @Test
    void maxConsistentColumns2() {
        assertThat(
                new Solution().maxConsistentColumns(new int[][] {{1, -1, 1}, {2, 2, 2}}, 1),
                equalTo(2));
    }

    @Test
    void maxConsistentColumns3() {
        assertThat(new Solution().maxConsistentColumns(new int[][] {{-5, 5}}, 9), equalTo(1));
    }
}
