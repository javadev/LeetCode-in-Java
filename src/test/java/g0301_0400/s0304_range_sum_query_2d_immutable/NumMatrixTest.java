package g0301_0400.s0304_range_sum_query_2d_immutable;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class NumMatrixTest {
    @Test
    void numMatrix() {
        NumMatrix numMatrix =
                new NumMatrix(
                        new int[][] {
                            {3, 0, 1, 4, 2},
                            {5, 6, 3, 2, 1},
                            {1, 2, 0, 1, 5},
                            {4, 1, 0, 1, 7},
                            {1, 0, 3, 0, 5}
                        });
        assertThat(numMatrix.sumRegion(2, 1, 4, 3), equalTo(8));
        assertThat(numMatrix.sumRegion(1, 1, 2, 2), equalTo(11));
        assertThat(numMatrix.sumRegion(1, 2, 2, 4), equalTo(12));
    }
}
