package g1001_1100.s1072_flip_columns_for_maximum_number_of_equal_rows;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxEqualRowsAfterFlips() {
        assertThat(new Solution().maxEqualRowsAfterFlips(new int[][] {{0, 1}, {1, 1}}), equalTo(1));
    }

    @Test
    void maxEqualRowsAfterFlips2() {
        assertThat(new Solution().maxEqualRowsAfterFlips(new int[][] {{0, 1}, {1, 0}}), equalTo(2));
    }

    @Test
    void maxEqualRowsAfterFlips3() {
        assertThat(
                new Solution()
                        .maxEqualRowsAfterFlips(new int[][] {{0, 0, 0}, {0, 0, 1}, {1, 1, 0}}),
                equalTo(2));
    }
}
